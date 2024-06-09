package com.bloggerdemoapp.gblog.service;

import com.bloggerdemoapp.gblog.entity.CommentEntity;
import com.bloggerdemoapp.gblog.entity.PostEntity;

public interface Comment {
    public CommentEntity createComment(CommentEntity commententity,long postId);
}
