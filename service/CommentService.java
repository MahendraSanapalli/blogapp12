package com.blogapp12.service;

import com.blogapp12.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto,long PostId);
}
