package com.RapidGrow.common.exceptions.handlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Exception> handleGlobalException(Exception e, WebRequest request){
        System.out.println("Running");
        return ResponseEntity.status(400).body(e);
    }


}
