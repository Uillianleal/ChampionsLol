package me.dio.sdw24.adapters.out;

import feign.FeignException;
import feign.RequestInterceptor;
import me.dio.sdw24.domain.ports.GenerativeAiApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@ConditionalOnProperty(name = "generative-ai.provider", havingValue = "GEMINI")
@FeignClient(name = "geminiApi", url = "${gemini.base-url}", configuration = GoogleGeminiApiService.Config.class)
public interface GoogleGeminiApiService extends GenerativeAiApiService {

    @PostMapping("/v1beta/models/gemini-pro:generateContent")
    GoogleGeminiResponse textOnlyInput(GoogleGeminiRequest request);

    @Override
    default String generateContent(String objective, String context) {
        String prompt = """
                %s
                %s
                """.formatted(objective, context);

        GoogleGeminiRequest request = new GoogleGeminiRequest(
                List.of(new Content(List.of(new Part(prompt))))
        );

        try {
            GoogleGeminiResponse response = textOnlyInput(request);
            return response.candidates().get(0).content().parts().get(0).text();
        } catch (FeignException httpErrors) {
            return "Foi mal! Errro de comunicação com a API do Google Gemini";
        } catch (Exception unexpectedError) {
              return "Foi mal! O retorno da API do Google Gemini não contem os dados esperados";
        }
    }

    record GoogleGeminiRequest(List<Content> contents){}
    record Content(List<Part> parts) {}
    record Part(String text){}

    record GoogleGeminiResponse(List<Candidate> candidates){}
    record Candidate(Content content) {}

    class Config {
        @Bean
        public RequestInterceptor apiKeyRequestInterceptor(@Value("${gemini.api-key}") String apiKey) {
            return requestTemplate -> requestTemplate.query("key", apiKey);
        }
    }

}
