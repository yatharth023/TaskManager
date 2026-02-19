package com.example.taskmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
// This tells Spring Boot that this class is a specialized component designed to intercept exceptions thrown by any controller in your app. It combines @ControllerAdvice and @ResponseBody, ensuring the response is written directly as JSON or a String.
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    // It tells Spring: "Whenever a ResourceNotFoundException is thrown anywhere in the code, stop the normal flow and run this specific method instead."
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    // The method "handleNotFound" takes the exception that was thrown and transforms it into a clean HTTP response.
    // HttpStatus.NOT_FOUND to ensure the browser or mobile app receives an official 404 status code, rather than a generic 500 error.
}
