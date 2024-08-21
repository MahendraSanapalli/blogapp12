package com.blogapp12.controller;

import com.blogapp12.entity.Comment;
import com.blogapp12.payload.CommentDto;
import com.blogapp12.service.CommentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Data
@RestController
@RequestMapping("/api/comments")
@AllArgsConstructor
public class CommentController {
    private CommentService commentService;
    //http://localhost:8080/api/comments/1
            @PostMapping("/{postId}")
            public ResponseEntity<CommentDto> createComment(
                   @RequestBody CommentDto commentDto,
                   @PathVariable long postId){
        CommentDto dto = commentService.createComment(commentDto, postId);
        return  new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
