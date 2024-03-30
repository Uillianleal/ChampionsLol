package me.dio.sdw24.application;

import me.dio.sdw24.domain.exception.ChampionNotFundException;
import me.dio.sdw24.domain.model.Champions;
import me.dio.sdw24.domain.ports.ChampionsRepository;
import me.dio.sdw24.domain.ports.GenerativeAiApiService;

public record AskChampionsUseCase(ChampionsRepository repository, GenerativeAiApiService generativeAiApiService) {

    public String askChampion(Long championId, String question) {

        Champions champions = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFundException(championId));

        String context = champions.generateContextByQuestion(question);
        String objective = """
                Atue como uma assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                Responda perguntas incorporando a personalidade e estilo de um determinado Campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                """;

        return generativeAiApiService.generateContent(objective, context);
    }
}
