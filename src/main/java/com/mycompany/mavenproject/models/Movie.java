/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.models;

import java.util.List;

/**
 *
 * @author Remigija
 */
public class Movie {
    
    int id;
    private String title;
    private String watchedRec;
    private String desc;
    

    public Movie() {
    }

    public Movie(int id, String title, String watchedRec, String desc ) {
       
        this.id = id;
        this.title = title;
        this.watchedRec = watchedRec;
        this.desc = desc;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWatchedRec() {
        return watchedRec;
    }

    public void setWatchedRec(String watchedRec) {
        this.watchedRec = watchedRec;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    

    
    
    
    
}
