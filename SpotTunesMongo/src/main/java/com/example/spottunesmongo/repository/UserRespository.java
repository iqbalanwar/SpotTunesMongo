package com.example.spottunesmongo.repository;

import com.example.spottunesmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRespository extends MongoRepository<User, String> {
    @Query(" {'user.username' : ?0} ")
    public User findByUsername(String username);

    @Query(" {'user.username' : ?0, 'user.password' : ?0} ")
    public User login(String username, String password);

}
