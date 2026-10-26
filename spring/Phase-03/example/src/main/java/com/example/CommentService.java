package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
      private final CommentRepository commentRepository;
      
      @Autowired
      public CommentService(CommentRepository repository) {
    	  this.commentRepository = repository;
      }

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
