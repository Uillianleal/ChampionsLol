package me.dio.sdw24.domain.exception;

public class ChampionNotFundException extends RuntimeException {
    public ChampionNotFundException(Long championId) {
        super("Champion %d not found.".formatted(championId));
    }
}
