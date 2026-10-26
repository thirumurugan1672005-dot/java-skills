package com.sample1;


import java.util.logging.Logger;

import org.springframework.beans.BeansException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.sample1.model.Comment;
import com.sample1.service.CommentService;

/**
 * Hello world!
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
    	
    	
    	try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
    	    var commentService  = context.getBean(CommentService.class);
    	    
    	    var comment = new Comment();
    	    comment.setAuthor("Author");
    	    comment.setText("Message received");
    	    var value = commentService.deleteComment(comment);
    		
    	       logger.info(value);
    		
    	}
    	catch(BeansException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
      
        
        
    }
}
