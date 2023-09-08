package com.RapidGrow.controllers;

import com.RapidGrow.payloads.ApiResponse;
import com.RapidGrow.payloads.PostDto;
import com.RapidGrow.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    // creation of post
    @PostMapping("/create")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto postDto1 = this.postService.createPost(postDto);
        return new ResponseEntity<>(postDto1, HttpStatus.CREATED);
    }

    // get Post by Id
    @GetMapping("/get/{postId}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Long postId) {
        PostDto post = this.postService.getPostById(postId);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    // get All post
    @GetMapping("/All")
    public ResponseEntity<List<PostDto>> getAllPost() {
        return new ResponseEntity<>(this.postService.getAllPosts(), HttpStatus.OK);
    }

    //delete post by id
    @DeleteMapping("/delete/{postId}")
    public ResponseEntity<PostDto> deletePostById(@PathVariable long postId) {
        PostDto postDto = this.postService.deletePost(postId);
        return new ResponseEntity<>(postDto, HttpStatus.OK);
    }

    // update post

    @PutMapping("/update/{postId}")
    public ResponseEntity<ApiResponse> updatePost(@RequestBody PostDto postDto, @PathVariable Long postId) {
        PostDto updatedpost = this.postService.updatePost(postDto, postId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("successfully updated",true),HttpStatus.OK);
    }

       @GetMapping("/user/{userId}")
    public ResponseEntity<List<PostDto>> getPostByUser(@PathVariable Long userId){
        List<PostDto> postDtos=this.postService.getPostByUser(userId);
        return new ResponseEntity<>(postDtos,HttpStatus.OK);
       }

       @PostMapping("create/user/{userId}")
    public ResponseEntity<PostDto> createPostByUser(@RequestBody PostDto postDto, @PathVariable Long userId){
        PostDto createPost=this.postService.createPostByUser(postDto,userId);
        return new ResponseEntity<>(createPost,HttpStatus.CREATED);
       }


}
