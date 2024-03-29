package me.dio.sdw24;

import me.dio.sdw24.application.ListChampionsUseCase;
import me.dio.sdw24.domain.model.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderDevWeek2024Application {

	public static void main(String[] args) {SpringApplication.run(SantanderDevWeek2024Application.class, args);}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository) {
		return new ListChampionsUseCase(repository);
	}

}
