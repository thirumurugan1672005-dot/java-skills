package com.example.customer2.exception;

import java.net.URI;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleValidate(MethodArgumentNotValidException exception) {
        ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.EXPECTATION_FAILED, "Validation failed");

        detail.setTitle("Invalid Request Content");

        String errors = exception.getBindingResult().getFieldErrors()
                .stream().map(error -> error.getField() + " : " + error.getDefaultMessage())
                .collect(Collectors.joining(","));

        detail.setProperty("errors", errors);
        return detail;

    }

    @ExceptionHandler(org.springframework.web.servlet.resource.NoResourceFoundException.class)
       public ProblemDetail handleNotFoundException(org.springframework.web.servlet.resource.NoResourceFoundException e)
       {
     
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_ACCEPTABLE,"The requested resource was not found");
        problemDetail.setTitle("Resource Not Found");
        problemDetail.setType(URI.create("https://api.crm.com/errors/not-found"));
          return problemDetail;
       }

}
