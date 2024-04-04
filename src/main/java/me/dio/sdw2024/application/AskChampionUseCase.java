package me.dio.sdw2024.application;

import me.dio.sdw2024.domain.exception.ChampionNotFoundException;
import me.dio.sdw2024.domain.model.Champions;
import me.dio.sdw2024.domain.model.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question) {

        Champions champions = repository.findByID(championId)
                .orElseThrow(()->new ChampionNotFoundException(championId));
 // TODO: evoluir a lógica de negócio para considerar a integração com IAs generativas.
String championContext = champions.generateContextByQuestion(question);

        return championContext;
        }
    }

