package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope 
@Component 
public class LoginProcessor {

    private String username;
    private String password;

    private final LoginUserManagementService loginUserManagementService;
    private final LoginCounter counter;

    @Autowired 
    public LoginProcessor(LoginUserManagementService loginUserManagementService,LoginCounter counter){
        this.loginUserManagementService = loginUserManagementService;
        this.counter = counter;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        
        boolean isLoggedIn = false;
        if("user".equals(username) && "password".equals(password)){
            loginUserManagementService.setUsername(username);
            counter.increment();
             isLoggedIn = true;
        }
        return isLoggedIn;
    }
}
