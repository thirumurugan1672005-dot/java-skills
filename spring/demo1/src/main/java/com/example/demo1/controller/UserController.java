package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo1.service.UserService;

@Controller 
public class UserController {
    
    private  final UserService userService;
    @Autowired 
    public UserController(UserService userService){
       this.userService = userService;
    }

    @GetMapping ("/users")
    public String viewUsers(Model page){
        var users = userService.findAll();
        page.addAttribute("users",users);
        return "users.html";
    }

    @PostMapping ("/users")
    public String addUsers(@RequestParam Long userId , @RequestParam  String username, Model page){

        userService.addUser(userId, username);
        var users = userService.findAll();
        page.addAttribute("users", users);
        return "users.html";
    }
}
