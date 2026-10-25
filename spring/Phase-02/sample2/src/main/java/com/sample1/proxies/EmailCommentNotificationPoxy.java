package com.sample1.proxies;



import com.sample1.model.Comment;

public class EmailCommentNotificationPoxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
	   System.out.println("Sending comment to email ... "+comment.getAuthor());
		
	}

}
