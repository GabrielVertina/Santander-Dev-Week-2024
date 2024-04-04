package me.dio.sdw2024.adpters.out;

import me.dio.sdw2024.domain.model.Champions;
import me.dio.sdw2024.domain.model.ports.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

private final RowMapper<Champions> rowMapper;
    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    this.rowMapper = (rs, rowNum) -> new Champions(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("role"),
            rs.getString("lore"),
            rs.getString("imageUrl")
    );
    }
    @Override
    public List<Champions> findAll() {
        return jdbcTemplate.query("SELECT* FROM CHAMPIONS ",rowMapper);
    }

    @Override
    public Optional<Champions> findByID(Long id) {
String sql = "SELECT* FROM CHAMPIONS WHERE ID=?";
List<Champions> champion = jdbcTemplate.query(sql,rowMapper,id);
        return champion.stream().findFirst();
    }
}
