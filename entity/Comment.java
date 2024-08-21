package com.blogapp12.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private  String message;

    @ManyToOne
    @JoinColumn(name = "post id")
    private Post post;
}

