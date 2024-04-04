package com.vertina.gabriel.devweek;

import me.dio.sdw2024.application.AskChampionUseCase;
import me.dio.sdw2024.application.ListChampionsUseCase;
import me.dio.sdw2024.domain.model.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevWeekApplication.class, args);
	}
@Bean
public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
}
@Bean
public AskChampionUseCase provideAskChampionsUseCase(ChampionsRepository repository){
		return  new AskChampionUseCase(repository);

}

}
