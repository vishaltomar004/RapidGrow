package com.RapidGrow.controllers;

import com.RapidGrow.entities.User;
import com.RapidGrow.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    // create user
    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user) {
        try {
            User createdUser = this.userRepo.save(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }
}
