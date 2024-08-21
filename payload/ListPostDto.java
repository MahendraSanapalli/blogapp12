package com.blogapp12.payload;

import lombok.Data;

import java.util.List;
@Data
public class ListPostDto {
    private List<PostDto> postDto;

    private int totalpages;

    private int totalElements;

    private boolean firstPage;

    private boolean lastPage;

    private  int pageNumber;


}
