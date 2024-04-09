package com.vertina.gabriel.devweek.domain.ports;
import java.util.Optional;

import com.vertina.gabriel.devweek.domain.model.Champion;

import java.util.List;

public interface ChampionsRepository {

    List<Champion>findAll();


Optional<Champion> findByID(Long id);
}
