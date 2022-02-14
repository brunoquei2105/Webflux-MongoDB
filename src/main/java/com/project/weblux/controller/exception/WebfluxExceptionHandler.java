package com.project.weblux.controller.exception;

import com.project.weblux.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.time.Instant;

@ControllerAdvice
public class WebfluxExceptionHandler {

    @Value("${resourceNotFound}")
    private String error;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException resourceNotFoundException,
                                                          ServerRequest request){

        StandardError standardError = new StandardError();
        standardError.setError(error);
        standardError.setMassage(resourceNotFoundException.getMessage());
        standardError.setTimestamp(Instant.now());
        standardError.setStatus(HttpStatus.NOT_FOUND.value());
        standardError.setPath(request.uri().getPath());

        return new ResponseEntity<>(standardError, HttpStatus.NOT_FOUND);
    }
}
