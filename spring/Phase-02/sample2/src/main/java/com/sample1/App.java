package com.sample1;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.sample1.model.Comment;
import com.sample1.service.CommentService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
    	try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
    	    
    		Comment comment = new Comment();
    		comment.setAuthor("Demo user");
    		comment.setText("This is good !");
    		var commentService = context.getBean(CommentService.class);
    		commentService.publishComment(comment);
    	}
    	catch(BeansException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
      
        
        
    }
}
