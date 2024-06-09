package com.bloggerdemoapp.gblog.controller;

import com.bloggerdemoapp.gblog.entity.PostEntity;
import com.bloggerdemoapp.gblog.service.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
private Post post;

    public PostController(Post post) {
        this.post = post;
    }
    @PostMapping
    public ResponseEntity<PostEntity> createPost(@RequestBody PostEntity postentity){
        PostEntity post1 = post.createPost(postentity);
        return new ResponseEntity<>(post1,HttpStatus.CREATED);
    }
}
