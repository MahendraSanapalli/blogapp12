package com.blogapp12.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 3,message = "Title should be atleast 3 character")
    private String title;
    @NotEmpty
    private String description;
    private String content;


}

