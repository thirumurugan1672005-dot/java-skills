package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.main.User;
@Configuration
public class UserConfig {
    @Bean
    @Primary
    public User user1() {
    	User user = new User();
    	user.setUsername("Rahul");
    	return user;
    }
    
    @Bean 
    public User user2() {
    	 User user = new User();
    	 user.setUsername("Ravi");
    	 return user;
    }
    
    @Bean
    public Integer getInt() {
    	return 12;
    }
    
    @Bean
    public String getMessage() {
    	return "Hello Message";
    }
}
