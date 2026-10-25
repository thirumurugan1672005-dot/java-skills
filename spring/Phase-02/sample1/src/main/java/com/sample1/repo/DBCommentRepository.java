package com.sample1.repo;

import org.springframework.stereotype.Component;

import com.sample1.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing ..."+comment.getText());
		
	}

}
