/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO5.entity;

/**
 *
 * @author shneha
 */
public class Artist {
    private int id;
    private String name;
    private String genre;
   private String songs;

    public Artist() {
    }

    public Artist(int id, String name, String genre, String songs) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    
}
