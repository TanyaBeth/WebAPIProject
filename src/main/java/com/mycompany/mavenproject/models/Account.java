/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.models;

import java.util.List;

/**
 *
 * @author tanya
 * @author Remigija
 */



public class Account{
    private int id;
    private String nickName;
    private String password;
    private List<Movie> moviesList;
  
     public Account() {
    }
        public Account(int id, String nickName, String password, List<Movie> moviesList) {
        this.id = id;
        this.nickName = nickName; 
        this.password = password;
        this.moviesList = moviesList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
    
    



  
    
}
