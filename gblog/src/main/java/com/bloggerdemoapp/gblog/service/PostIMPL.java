package com.bloggerdemoapp.gblog.service;

import com.bloggerdemoapp.gblog.entity.PostEntity;
import com.bloggerdemoapp.gblog.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostIMPL implements Post{
    private PostRepository postRepository;


    public PostIMPL(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostEntity createPost(PostEntity postEntity) {
        PostEntity savedPost = postRepository.save(postEntity);
        return savedPost;
    }
}
