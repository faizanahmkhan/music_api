package com.example.musicapi.models;

import org.apache.catalina.User;

import javax.persistence.*;
import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "playlists")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //properties
    @Column(name = "name")
    private String name;

    @Column(name = "user")
    private User user;

    @Column(name = "track")
    private List<Track> tracks;

    //instantiation
    public Playlist(String name, User user){
        this.name = name;
        this.user = user;
        this.tracks = new ArrayList<>();
    }

    // empty constructor
    public Playlist(){

    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}