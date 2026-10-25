package com.sample1.repo;



import com.sample1.model.Comment;


public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing ..."+comment.getText());
		
	}

}
