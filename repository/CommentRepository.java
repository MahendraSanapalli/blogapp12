package com.blogapp12.repository;

import com.blogapp12.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
  //  @Override
   // List<Comment> findCommentByPostId(long postId);
}
