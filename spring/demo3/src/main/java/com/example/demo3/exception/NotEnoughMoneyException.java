package com.example.demo3.exception;

public class NotEnoughMoneyException extends RuntimeException {
     public NotEnoughMoneyException(String message) {
    	 super(message);
     }
}
