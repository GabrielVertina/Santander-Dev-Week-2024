package me.dio.sdw2024.adpters.exception;

import me.dio.sdw2024.domain.exception.ChampionNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ChampionNotFoundException.class)
    public ResponseEntity<ApiError> handlerDomainException(ChampionNotFoundException domainError) {
       return ResponseEntity.
               unprocessableEntity().
                body(new ApiError(domainError.getMessage()));

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handlerDomainException(Exception unexpepctedError) {
       String message = "Ops ocorreu um erro inesperado";
    logger.error(message,unexpepctedError);
        return ResponseEntity
                .internalServerError()
                .body(new ApiError(message));
    }
   public record ApiError(String message){


   }


    }


