package com.sample1.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.sample1.ToLog;
import com.sample1.model.Comment;

@Service
public class CommentService {
      private Logger logger = Logger.getLogger(CommentService.class.getName());
      
      public String publishComment(Comment comment) {
    	  logger.info("Publishing comment : "+comment.getText());
    	  return "SUCCESS";
      }
      @ToLog
      public String deleteComment(Comment comment) {
    	  System.out.println("Deleting Comment .... "+comment.getText());
    	  return "SUCCESS";
      }
      public void editComment(Comment comment) {
    	  System.out.println("Editing Comment ... "+comment.getText());
      }
}
