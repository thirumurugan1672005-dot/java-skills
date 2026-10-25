package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.main.Car;
import com.example.main.Friend;
import com.example.main.User;
@Configuration
public class UserConfig {
    @Bean
    @Primary
    public User user1() {
    	User user = new User();
    	user.setUsername("Rahul");
    	user.setFriend(friend()); // directly passed 
    	return user;
    }
    
    @Bean
    public Friend friend() {
    	Friend friend = new Friend();
    	friend.setMockName("@rahul0008");
    	return friend;
    }
    
    @Bean 
    public User user2(Friend friend) {
    	User user = new User();
    	user.setUsername("Rahul");
    	user.setFriend(friend); // passed as method parameter
    	return user;
    }
    
    @Bean
    public User user3(@Qualifier("car") Car car) {
    	User user =  new User();
    	user.setCar(car); // component passed as method parameter
    	
    	return user;
    }
   
}
