package com.example.demo3.service;

import org.springframework.stereotype.Service;

import com.example.demo3.dto.PaymentDetails;
import com.example.demo3.exception.NotEnoughMoneyException;

@Service
public class PaymentService {
     public PaymentDetails processPayment() {
    	 throw new NotEnoughMoneyException("not enough money");
     }
}
