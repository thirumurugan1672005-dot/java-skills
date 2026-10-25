package com.sample1.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample1.model.Comment;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push notification for comment "+comment.getText());
		
	}

}
