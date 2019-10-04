package com.example.spottunesmongo.services;

import com.example.spottunesmongo.model.User;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface UserServices {
    public User createUser(User newUser);

    public List<User> listUsers();

    public User login(User user);

    public HttpStatus deleteById(String userId);

    public User changePassword(String username, String newPassword);
}