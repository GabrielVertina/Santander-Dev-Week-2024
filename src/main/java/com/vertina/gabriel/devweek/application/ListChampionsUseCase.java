package com.vertina.gabriel.devweek.application;

import com.vertina.gabriel.devweek.domain.model.Champion;
import com.vertina.gabriel.devweek.domain.ports.ChampionsRepository;


import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {
    public List<Champion> findAll() {
        return repository.findAll();

    }
}
