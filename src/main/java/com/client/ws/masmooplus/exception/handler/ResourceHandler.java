package com.client.ws.masmooplus.exception.handler;

import com.client.ws.masmooplus.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> notFoundException(NotFoundException n){
        String error = n.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
