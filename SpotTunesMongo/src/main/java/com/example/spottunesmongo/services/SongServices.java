package com.example.spottunesmongo.services;

import com.example.spottunesmongo.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SongServices {
    // how do we want the user to manipulate the db?
    // CRUD

    // list songs
    public List<Song> listSongs();

    // add song
    public Song addSong(Song song);

    // delete song
    public String deleteSong(String id);

}
