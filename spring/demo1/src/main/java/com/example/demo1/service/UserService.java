package com.example.demo1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo1.model.User;

@Service 
public class UserService {
    
    private List<User> users = new ArrayList<>();

    public List<User> findAll(){
         return users;
    }

    public void addUser(Long userId,String name){
         User user = new User();
         user.setUserId(userId);
         user.setUsername(name);

         users.add(user);
    }
    
}
