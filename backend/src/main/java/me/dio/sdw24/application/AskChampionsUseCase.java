package me.dio.sdw24.application;

import me.dio.sdw24.domain.exception.ChampionNotFundException;
import me.dio.sdw24.domain.model.Champions;
import me.dio.sdw24.domain.ports.ChampionsRepository;

public record AskChampionsUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question) {

        Champions champions = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFundException(championId));

        String championContext = champions.generateContextByQuestion(question);

        return championContext;
    }
}
