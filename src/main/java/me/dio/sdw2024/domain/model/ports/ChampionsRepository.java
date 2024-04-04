package me.dio.sdw2024.domain.model.ports;
import java.util.Optional;
import me.dio.sdw2024.domain.model.Champions;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ChampionsRepository {
    List<Champions>findAll();
Optional<Champions> findByID(Long id);
}
