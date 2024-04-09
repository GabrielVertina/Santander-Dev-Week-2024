package com.vertina.gabriel.devweek;

import com.vertina.gabriel.devweek.application.AskChampionUseCase;
import com.vertina.gabriel.devweek.application.ListChampionsUseCase;
import com.vertina.gabriel.devweek.domain.ports.ChampionsRepository;
import com.vertina.gabriel.devweek.domain.ports.GenerativeAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class DevWeekApplication {


	ChampionsRepository repository;
	GenerativeAiService genAiService;
	public static void main(String[] args) {

		SpringApplication.run(DevWeekApplication.class, args);
	}
@Bean
public ListChampionsUseCase provideListChampionsUseCase(){
		return new ListChampionsUseCase(repository);
}
@Bean
public AskChampionUseCase provideAskChampionsUseCase(){
		return  new AskChampionUseCase(repository ,genAiService);

}

}
