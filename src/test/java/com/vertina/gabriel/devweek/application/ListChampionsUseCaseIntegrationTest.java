package com.vertina.gabriel.devweek.application;

import me.dio.sdw2024.application.ListChampionsUseCase;
import me.dio.sdw2024.domain.model.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

private ListChampionsUseCase listChampionsUseCase;
@Test
public void testListChampions(){
List<Champions> champions = listChampionsUseCase.findAll();

    Assertions.assertEquals(12,champions.size());
}
}
