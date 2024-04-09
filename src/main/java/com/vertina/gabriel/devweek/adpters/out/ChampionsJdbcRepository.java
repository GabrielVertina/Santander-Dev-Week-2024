package com.vertina.gabriel.devweek.adpters.out;

import com.vertina.gabriel.devweek.domain.model.Champion;
import com.vertina.gabriel.devweek.domain.ports.ChampionsRepository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {


    private final JdbcTemplate jdbcTemplate;

private final RowMapper<Champion> rowMapper;
    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    this.rowMapper = (rs, rowNum) -> new Champion(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("role"),
            rs.getString("lore"),
            rs.getString("image_url")
    );
    }
    @Override
    public List<Champion> findAll() {

        return jdbcTemplate.query("SELECT * FROM CHAMPIONS ",rowMapper);
    }

    @Override
    public Optional<Champion> findByID(Long id) {
String sql = "SELECT * FROM CHAMPIONS WHERE ID = ?";
List<Champion> champions = jdbcTemplate.query(sql,rowMapper,id);
        return champions.stream().findFirst();
    }
}
