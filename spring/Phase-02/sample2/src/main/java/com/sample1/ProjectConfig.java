package com.sample1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample1.repo.CommentRepository;
import com.sample1.repo.DBCommentRepository;
import com.sample1.service.CommentService;
import com.sample1.proxies.CommentNotificationProxy;
import com.sample1.proxies.EmailCommentNotificationPoxy;

@Configuration

public class ProjectConfig {
      @Bean
      public CommentRepository commentRepository() {
    	  CommentRepository commentRepository = new DBCommentRepository();
    	  return commentRepository;
      }
      
      @Bean
      public CommentNotificationProxy commentNotificationProxy() {
    	  CommentNotificationProxy proxy = new EmailCommentNotificationPoxy();
    	  return proxy;
      }
      
      @Bean
      public CommentService commentService(CommentRepository commentRepository,CommentNotificationProxy proxy) {
    	  CommentService service = new CommentService(commentRepository,proxy);
    	   return service;
      }
}
