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
    public String deleteSong(String id) {
        songRepository.deleteById(id);
        return "Success. Song deleted.";
    }
}
