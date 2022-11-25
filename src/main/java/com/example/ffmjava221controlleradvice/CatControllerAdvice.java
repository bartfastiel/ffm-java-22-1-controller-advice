package com.example.ffmjava221controlleradvice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CatControllerAdvice {

    @ExceptionHandler(CatNotFoundException.class)
    ResponseEntity<String> handleCatNotFoundException(CatNotFoundException ex) {
        return ResponseEntity.badRequest().body("Cat not found");
    }
}
