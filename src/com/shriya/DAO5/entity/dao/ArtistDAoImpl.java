/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO5.entity.dao;

import com.shriya.DAO5.entity.Artist;

/**
 *
 * @author shneha
 */
public class ArtistDAoImpl implements ArtistDAO{
    private Artist[] ArtistList = new Artist[10];
    private int counter = 0;
   

    @Override
    public boolean insert(Artist s) {
        if (ArtistList.length == counter) {
            return false;
        } else {
            ArtistList[counter] = s;
        }
        counter++;
        return true;
    }
    

    @Override
    public boolean update(Artist s) {
        if (ArtistList.length == counter) {
            return false;
        } else {
            ArtistList[counter] = s;
        }
        counter++;
        return true;
    }
    

    @Override
    public boolean delete(int id) {
        for (int i = 0; i <  ArtistList.length; i++) {
             Artist s =  ArtistList[i];
            if (s != null && s.getId() == id) {
                 ArtistList[i] = null;
                return true;
            }

        }
        return false;

    }
    

    @Override
    public Artist getById(int id) {
    for (int i = 0; i <  ArtistList.length; i++) {
             Artist s =  ArtistList[i];
            if (s != null && s.getId() == id) {
                 ArtistList[i] = null;
                return s;
            }

        }
        return null;
    
    }

    @Override
    public Artist[] getAll() {
        return ArtistList;
    }
}