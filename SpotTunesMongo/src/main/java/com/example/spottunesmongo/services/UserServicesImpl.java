package com.example.spottunesmongo.services;

import com.example.spottunesmongo.model.User;
import com.example.spottunesmongo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRespository userRespository;

    @Override
    public User createUser(User newUser) {
        return userRespository.save(newUser);
    }

    @Override
    public List<User> listUsers() {
        return userRespository.findAll();
    }

    @Override
    public User login(User user){
        return userRespository.login(user.getUsername(), user.getPassword());
    }
}
