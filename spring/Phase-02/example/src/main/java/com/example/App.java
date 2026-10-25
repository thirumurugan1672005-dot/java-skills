package com.example;



import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.CarConfig;
import com.example.config.UserConfig;
import com.example.main.Car;
import com.example.main.Friend;
import com.example.main.Tyre;
import com.example.main.User;
/**
 * Hello world!
 */
public class App {
	public static void method1() {
try (var context1 = new AnnotationConfigApplicationContext(UserConfig.class,CarConfig.class);
                
        		) {
		
		  User user = context1.getBean("user2",User.class);
		  System.out.println("User : "+user.getUsername());
		  Friend friend = context1.getBean(Friend.class);
		  System.out.println("Friend : "+friend.getMockName());
		  System.out.println("Friend user : "+user.getFriend());
		  
		  User user1 = context1.getBean("user3",User.class);
		  System.out.println(user1.getCar());
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}
	public static void method2() {
		try(var context = new AnnotationConfigApplicationContext(CarConfig.class)){
			Car car = new Car(new Tyre());
			System.out.println(car.getTyre());
		}
		catch(BeansException e) {
			System.out.println(e.getMessage());
		}
	}
    public static void main(String[] args) {
       method2();
    }
}
