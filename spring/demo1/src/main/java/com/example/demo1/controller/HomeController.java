package com.example.demo1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class HomeController {
    @GetMapping ("/home")
    @ResponseBody 
    public String home(){
        return "Welcome to the spring application";
    }
    @GetMapping("/homepage")
    public String homePage(){
        return "home.html";
    }

    
    
}
