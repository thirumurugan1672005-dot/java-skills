package com.sample1.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample1.model.Comment;
import com.sample1.proxies.CommentNotificationProxy;
import com.sample1.repo.CommentRepository;

@Component
public class CommentService {
   private final CommentRepository commentRepository;
   private final CommentNotificationProxy commentNotificationProxy;
public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
	super();
	this.commentRepository = commentRepository;
	this.commentNotificationProxy = commentNotificationProxy;
}
public void publishComment(Comment comment) {
	commentRepository.storeComment(comment);
	commentNotificationProxy.sendComment(comment);
}
}
