package com.example.spottunesmongo.services;

import com.example.spottunesmongo.model.Song;
import com.example.spottunesmongo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServicesImp implements SongServices {

    @Autowired
    SongRepository songRepository;

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Song addSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public String deleteSong(String title) {
        // Find a song in the database, by it's title
        // return the object
        // delete the object with .delete(obj)
        Song song = songRepository.findByTitle(title);
        songRepository.delete(song);
        return "Success. Song deleted.";
    }

    @Override
    public Song updateTitle(String title, String newTitle) {
        Song song = songRepository.findByTitle(title);
        song.setTitle(newTitle);
        return songRepository.save(song);
    }
}
