package com.example.main;

import org.springframework.beans.factory.annotation.Qualifier;

public class User {
   private String username;
   private Friend friend;
   
  
   public Car car;

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}

public Friend getFriend() {
	return friend;
}

public void setFriend(Friend friend) {
	this.friend = friend;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
}
