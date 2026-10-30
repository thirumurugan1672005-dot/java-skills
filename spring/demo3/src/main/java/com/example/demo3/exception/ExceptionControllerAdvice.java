package com.example.demo3.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo3.dto.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {
   @ExceptionHandler(NotEnoughMoneyException.class)
   public ResponseEntity<ErrorDetails> exceptionNotEnoughMoney(){
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setMessage("Not enough money to make payment");
		return ResponseEntity.badRequest().body(errorDetails);
   }
}
