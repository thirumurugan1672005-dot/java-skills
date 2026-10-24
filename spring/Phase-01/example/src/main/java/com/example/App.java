package com.example;

import java.util.Arrays;
import java.util.function.Supplier;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.StudentConfig;
import com.example.config.UserConfig;
import com.example.main.Student;
import com.example.main.User;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try (var context1 = new AnnotationConfigApplicationContext(UserConfig.class);
        		var context2 =new AnnotationConfigApplicationContext(StudentConfig.class);
        		var context3 =new AnnotationConfigApplicationContext(UserConfig.class);
        		) {
			User user = context1.getBean(User.class);
			System.out.println(user.getUsername());
			Student student = context2.getBean(Student.class);
			System.out.println(student.getName());
			
			
			// register bean 
			
			User newUser = new User();
			newUser.setUsername("Jack");
			
			Supplier<User> supp = () -> newUser;
			
			context3.registerBean("user3",User.class,supp);
			
			User find = context3.getBean("user3",User.class);
			System.out.println(find.getUsername());
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    }
}
