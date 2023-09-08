package com.RapidGrow.service;

import com.RapidGrow.payloads.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostDto deletePost(Long postId);

    PostDto updatePost(PostDto postDto, Long postId);

    PostDto getPostById(Long postId);

    List<PostDto> getAllPosts();

    PostDto createPostByUser(PostDto postDto, Long userId);

    List<PostDto> getPostByUser(Long userId);


}
