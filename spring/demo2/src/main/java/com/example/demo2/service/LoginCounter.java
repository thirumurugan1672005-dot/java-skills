package com.example.demo2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component 
@ApplicationScope 
public class LoginCounter {
    public int count;
    public int getCount(){
        return this.count;
    }
    public void increment(){
        this.count++;
    }
}
