package com.sample1.repo;

import com.sample1.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
