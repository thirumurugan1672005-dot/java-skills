package com.example.customer;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.net.URI;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice 
public class GlobalExceptionAdvice {
     @ExceptionHandler(MethodArgumentNotValidException.class)
     
    public ProblemDetail handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
         ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.EXPECTATION_FAILED,"Invvalid customer data");
         detail.setTitle("Invalid data format");
       String errors = e.getBindingResult().getFieldErrors().stream()
                                             .map(error-> error.getField() +"  "+error.getDefaultMessage())
                                             .collect(Collectors.joining(","));

        detail.setProperty("errors", errors);
        return detail;
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public  ProblemDetail handleNotResourceException(NoResourceFoundException exception){
         ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_ACCEPTABLE, "No such Resource");
         detail.setTitle("Resource not found");
         detail.setType(URI.create("https://api.crm.errors.not-found"));
         return detail;
    }

}
