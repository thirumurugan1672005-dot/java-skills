package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.service.LoginProcessor;
import com.example.demo2.service.LoginUserManagementService;

@Controller 
public class LoginController {

    private final LoginProcessor processor;
    
    @Autowired 
   public  LoginController(LoginProcessor processor){
        this.processor = processor;
    }

    @GetMapping ("/")
    public String loginPage(){
        return "login.html";
    }
    @PostMapping("/")
    public String login(@RequestParam  String username,@RequestParam  String password, Model page){
        processor.setUsername(username);
        processor.setPassword(password);
        boolean isLoggedIn = processor.login();
        if(isLoggedIn){
            return "redirect:/main";
        }
        else{
            page.addAttribute("message", "Login failed!");
        }
         return "login.html";
    }
}
