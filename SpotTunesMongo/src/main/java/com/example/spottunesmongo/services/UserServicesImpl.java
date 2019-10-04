package com.example.spottunesmongo.services;

import com.example.spottunesmongo.model.User;
import com.example.spottunesmongo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
//        User newUser = userRespository.findByUsername(user.getUsername());
//        if(newUser != null && user.getPassword().equals(newUser.getPassword())) {
//            return userRespository.login(user.getUsername(), user.getPassword());
//        }
//        return null;
        return userRespository.login(user.getUsername(), user.getPassword());
    }

    @Override
    public HttpStatus deleteById(String userId){
        userRespository.deleteById(userId);
        return HttpStatus.OK;
    }

    @Override
    public User changePassword(String username, String newPassword) {
        User changePwUser = userRespository.findByUsername(username);
        changePwUser.setPassword(newPassword);
        return userRespository.save(changePwUser);
    }
}