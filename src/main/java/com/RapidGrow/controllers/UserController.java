package com.RapidGrow.controllers;

import com.RapidGrow.payloads.ApiResponse;
import com.RapidGrow.payloads.UserDto;
import com.RapidGrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
//    @Autowired
//    private UserRepo userRepo;

    // create user
//    @PostMapping("/")
//    public ResponseEntity<User> create(@RequestBody User user) {
//        try {
//            User createdUser = this.userRepo.save(user);
//            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
//        } catch (Exception e) {
//            throw e;
//        }
//    }

    @Autowired
    private UserService userService;

    // user creating API
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUser = this.userService.createUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // delete

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable long userId) {
        this.userService.deleteUser(userId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Susseffully", true), HttpStatus.OK);
    }

    // Get Single User By ID
    @GetMapping("/get/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable long userId) {
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }

    // Get All user
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getAllUser() {

        return ResponseEntity.ok(this.userService.getAllUser());
    }

    //update User
    @PutMapping("/update/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable long userId) {
        return ResponseEntity.ok(this.userService.updateUser(userDto, userId));
    }


}
