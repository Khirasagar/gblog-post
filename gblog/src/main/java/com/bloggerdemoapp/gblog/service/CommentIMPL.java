package com.bloggerdemoapp.gblog.service;

import com.bloggerdemoapp.gblog.entity.CommentEntity;
import com.bloggerdemoapp.gblog.entity.PostEntity;
import com.bloggerdemoapp.gblog.repository.CommentRepository;
import com.bloggerdemoapp.gblog.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentIMPL implements Comment{
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentIMPL(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentEntity createComment(CommentEntity commententity,long postId) {
        PostEntity postEntity = postRepository.findById(postId).get();
         commententity.setPost(postEntity);
        CommentEntity savedComment = commentRepository.save(commententity);
        return savedComment;
    }
}
