package com.example.spottunesmongo.controller;

import com.example.spottunesmongo.model.User;
import com.example.spottunesmongo.services.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServicesImpl userServices;

    @PostMapping("/signup")
    public User signUpUser(@RequestBody User user) { return userServices.createUser(user); }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userServices.login(user);
    }

    @GetMapping("/user/list")
    public List<User> listUsers() { return userServices.listUsers(); }

    @DeleteMapping("/user/{userId}")
    public HttpStatus deleteUser(@PathVariable String userId) {
        return userServices.deleteById(userId);
    }

    @PostMapping("/{username}/{newPassword}")
    public User changePassword(@PathVariable String username, @PathVariable String newPassword) {
        return userServices.changePassword(username, newPassword);
    }
}