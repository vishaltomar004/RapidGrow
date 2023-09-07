package com.RapidGrow.serviceImpl;

import com.RapidGrow.entities.Post;
import com.RapidGrow.exceptions.ResourceNotFoundException;
import com.RapidGrow.payloads.PostDto;
import com.RapidGrow.repositories.PostRepo;
import com.RapidGrow.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = this.modelMapper.map(postDto, Post.class);
        Post savedPost = this.postRepo.save(post);
        return this.modelMapper.map(savedPost, PostDto.class);

    }

    @Override
    public PostDto deletePost(Long postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post", postId));
        this.postRepo.delete(post);
        return this.modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Long postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post", postId));
        post.setDescription(postDto.getDescription());
        post.setImageUrl(postDto.getImageUrl());
        post.setVideoUrl(postDto.getVideoUrl());
        post.setPrice(postDto.getPrice());
        post.setWorkAddress(postDto.getWorkAddress());
        post.setLastDateToBid(postDto.getLastDateToBid());
//        post.setId();
        this.postRepo.save(post);
        return this.modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post", postId));
        return this.modelMapper.map(post, PostDto.class);

    }

    @Override
    public List<PostDto> getAllPosts() {

        List<Post> posts=this.postRepo.findAll();
        List<PostDto> postDtos= posts.stream().map(post -> this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
        return postDtos;
    }
}
