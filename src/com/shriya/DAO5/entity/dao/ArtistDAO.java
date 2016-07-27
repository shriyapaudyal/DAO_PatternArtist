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
public interface ArtistDAO {
    boolean insert(Artist s);

    boolean update(Artist s);

    boolean delete(int id);

   Artist getById(int id);

    Artist[] getAll();

    
}
