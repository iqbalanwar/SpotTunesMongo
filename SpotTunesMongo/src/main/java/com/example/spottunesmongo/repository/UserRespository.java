package com.example.spottunesmongo.repository;

import com.example.spottunesmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends MongoRepository<User, String> {
    @Query(" {'username' : ?0} ")
    public User findByUsername(String username);

    @Query(" {'username' : ?0, 'password' : ?1} ")
    public User login(String username, String password);

}