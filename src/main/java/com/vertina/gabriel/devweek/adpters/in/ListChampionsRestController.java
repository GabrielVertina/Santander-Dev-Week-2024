package com.vertina.gabriel.devweek.adpters.in;

import com.vertina.gabriel.devweek.application.ListChampionsUseCase;
import com.vertina.gabriel.devweek.domain.model.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
    @CrossOrigin
    @GetMapping
    public List<Champion> findAllChampions(){

    return useCase.findAll();
}

}
