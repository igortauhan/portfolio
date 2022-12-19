package com.igortauhan.portfolio.exception;

import com.igortauhan.portfolio.exception.exceptions.ObjectNotFoundException;
import com.igortauhan.portfolio.exception.model.BasicError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(value = ObjectNotFoundException.class)
    public ResponseEntity<BasicError> objectNotFound(ObjectNotFoundException exception,
                                                     HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new BasicError(
                        System.currentTimeMillis(),
                        HttpStatus.NOT_FOUND.value(),
                        "Not found.",
                        exception.getMessage()
                )
        );
    }
}
