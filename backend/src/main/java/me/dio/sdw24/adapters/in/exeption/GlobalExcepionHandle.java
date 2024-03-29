package me.dio.sdw24.adapters.in.exeption;

import me.dio.sdw24.domain.exception.ChampionNotFundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExcepionHandle {

    private final Logger logger = LoggerFactory.getLogger(GlobalExcepionHandle.class);

    @ExceptionHandler(ChampionNotFundException.class)
    public ResponseEntity<ApiError> handleDomainException(ChampionNotFundException domainError) {
        return ResponseEntity.unprocessableEntity().body(new ApiError(domainError.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleDomainException(Exception unexpectedErrror) {
        String message = "Ops! Ocorreu um erro inesperado!";
        logger.error(message, unexpectedErrror);
        return ResponseEntity.unprocessableEntity().body(new ApiError(message));
    }

    public record ApiError(String message) {}
}
