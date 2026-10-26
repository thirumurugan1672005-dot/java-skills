package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
	public static void main(String[] args) {
		  var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		  
		  Example example1 = context.getBean("example1",Example.class);
		  Example example2 = context.getBean("example1",Example.class);
		  boolean isSameBean = example1 == example2;
		  System.out.println(isSameBean);
		  
		  var commentService = context.getBean(CommentService.class);
		  var userService = context.getBean(UserService.class);
		  var commentRepo1 = commentService.getCommentRepository();
		  var commentRepo2 = userService.getCommentRepository();
		  System.out.println(commentRepo1 == commentRepo2);
		  
		  System.out.println("New bean creation starts ...");
		  var bean = context.getBean(New.class);
		  System.out.println("New bean not starts ....");
		  
		  
		  var pro1 = context.getBean(Demo.class);
		  var pro2 = context.getBean(Demo.class);
		  System.out.println(pro1 == pro2);
		  context.close();
	}
}