package me.dio.sdw24.domain.ports;

public interface GenerativeAiApiService {

    String generateContent(String objective, String context);
}
