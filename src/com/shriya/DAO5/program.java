/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO5;

import com.shriya.DAO5.entity.Artist;
import com.shriya.DAO5.entity.dao.ArtistDAO;
import com.shriya.DAO5.entity.dao.ArtistDAoImpl;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArtistDAO ArtistDAO = new ArtistDAoImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add Artist:");
            System.out.println("2. Update Artist:");
            System.out.println("3.Delete Artist:");
            System.out.println("4.Get by id:");
            System.out.println("5.Dispaly All Artist:");
            System.out.println("6.Exit:");
            System.out.println("enter your choice[1-6]:");

            switch (input.nextInt()) {
                case 1: {
                    System.out.println("Add a Artist:");
                    Artist s = new Artist();
                    System.out.println("Enter ID:");
                    s.setId(input.nextInt());
                    System.out.println("Enter  Name:");
                    s.setName(input.next());

                    System.out.println("Enter genre:");
                    s.setGenre(input.next());
                    System.out.println("Enter songs:");
                    s.setSongs(input.next());
                    if (ArtistDAO.insert(s)) {
                        System.out.println("Inserted Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                }

                break;
                case 2: {
                    Artist[] c = ArtistDAO.getAll();

                    System.out.println("Enter ID to be updated:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        Artist Artist = c[i];

                        if (Artist != null && Artist.getId() == a) {

                            System.out.println("Add a Artist:");
                            Artist s = new Artist();
                            System.out.println("Enter ID:");
                            s.setId(input.nextInt());
                            System.out.println("Enter  Name:");
                            s.setName(input.next());

                            System.out.println("Enter genre:");
                            s.setGenre(input.next());
                            System.out.println("Enter songs:");
                            s.setSongs(input.next());
                            if (ArtistDAO.update(s)) {
                                System.out.println("Inserted Sucessfully");
                            } else {
                                System.out.println("Space Full");
                            }
                        }
                    }
                    break;
                }

                case 3: {
                    Artist[] c = ArtistDAO.getAll();

                    System.out.println("Enter ID to be deleted");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        Artist Artist = c[i];

                        if (Artist != null && Artist.getId() == a) {
                           ArtistDAO.delete(a);

                        }
                    }

                
                break;}
            
                case 4: {
                     Artist[] c = ArtistDAO.getAll();

                    System.out.println("Enter ID ");
                    int a = input.nextInt();
                     for (int i = 0; i < c.length; i++) {
                        Artist Artist = c[i];

                        if (Artist != null && Artist.getId() == a) {

                            System.out.println("ID:" + Artist .getId());
                            System.out.println("Employee Name:" + Artist .getName());

                            System.out.println("genre:" + Artist .getGenre());
                            System.out.println("Song:" + Artist .getSongs());

                        }
                    }
                    break;
                }

                case 5: {

                   Artist[] c = ArtistDAO.getAll();

                    System.out.println("Enter ID ");
                    int a = input.nextInt();
                     for (int i = 0; i < c.length; i++) {
                        Artist Artist = c[i];


                             if (Artist != null ) {

                            System.out.println("ID:" + Artist .getId());
                            System.out.println("Employee Name:" + Artist .getName());

                            System.out.println("genre:" + Artist .getGenre());
                            System.out.println("Song:" + Artist .getSongs());

                        }

                    }

                    break;
                }

                case 6: {
                    System.out.println("Do You Really Want To Exit[y/n]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

                }
            }
        }
    }

    
}

    

