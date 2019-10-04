package com.example.spottunesmongo.repository;

import com.example.spottunesmongo.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SongRepository extends MongoRepository<Song, String> {
    @Query(" {'title' : ?0} ")
    public Song findByTitle(String title);
}