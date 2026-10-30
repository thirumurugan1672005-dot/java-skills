package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.service.LoginCounter;
import com.example.demo2.service.LoginUserManagementService;

@Controller 
public class MainController {

    private final LoginUserManagementService loginUserManagementService;
    private final LoginCounter counter;
    @Autowired 
    public MainController(LoginUserManagementService service,LoginCounter counter){
        this.loginUserManagementService = service;
        this.counter = counter;
    }
    @GetMapping("/main")
    public String mainPage(@RequestParam(required = false) String logout ,Model page){
        
        if(logout != null){
            loginUserManagementService.setUsername(null);
        }
        String username = loginUserManagementService.getUsername();
        if(username == null){
             return "redirect:/";
        }
        int count = counter.getCount();
        page.addAttribute("username", username);
        page.addAttribute("loginCount", count);
         return "main.html";
    }
}
