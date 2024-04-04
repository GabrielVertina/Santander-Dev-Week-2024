package me.dio.sdw2024.adpters.in;

import me.dio.sdw2024.application.ListChampionsUseCase;
import me.dio.sdw2024.domain.model.Champions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/Champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
@GetMapping
    public List<Champions> findAllChampions(){
return useCase.findAll();
}

}
