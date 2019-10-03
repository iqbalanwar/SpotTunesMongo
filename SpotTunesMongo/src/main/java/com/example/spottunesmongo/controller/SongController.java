package com.example.spottunesmongo.controller;

import com.example.spottunesmongo.model.Song;
import com.example.spottunesmongo.services.SongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    SongServices songServices;

    @GetMapping("/list")
    public List<Song> listAllSongs() {
        return songServices.listSongs();
    }

    @PostMapping("/add")
    public Song addSong(@RequestBody Song song) {
        return songServices.addSong(song);
    }

    @DeleteMapping("/delete/id")
    public String deleteSong(@PathVariable String id) {
        return songServices.deleteSong(id);
    }
}
