package com.bloggerdemoapp.gblog.controller;

import com.bloggerdemoapp.gblog.entity.CommentEntity;
import com.bloggerdemoapp.gblog.service.Comment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Comments")
public class CommentController {
    private Comment comment;

    public CommentController(Comment comment) {
        this.comment = comment;
    }
    @PostMapping
    public ResponseEntity<CommentEntity> createComment(@RequestParam long postId, @RequestBody CommentEntity commententity){
        CommentEntity comment1 = comment.createComment(commententity, postId);
        return new ResponseEntity<>( comment1,HttpStatus.CREATED);
    }
}
