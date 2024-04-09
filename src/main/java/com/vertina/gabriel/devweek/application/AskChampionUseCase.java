package com.vertina.gabriel.devweek.application;

import com.vertina.gabriel.devweek.domain.ports.ChampionsRepository;
import com.vertina.gabriel.devweek.domain.ports.GenerativeAiService;
import com.vertina.gabriel.devweek.domain.model.Champion;
import com.vertina.gabriel.devweek.domain.exception.ChampionNotFoundException;

public record AskChampionUseCase(ChampionsRepository repository , GenerativeAiService genAiService) {

    public String askChampion(Long championId, String question) {

        Champion champion = repository.findByID(championId)
                .orElseThrow(()->new ChampionNotFoundException(championId));

String context = champion.generateContextByQuestion(question);
        String objective = """
                Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                Responsa perguntas incorporando a personalidade e estilo de um determinado Campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                
                """;
    return genAiService.generateContent(objective,context);


        }
    }

