/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.services;

import com.mycompany.mavenproject.models.Movie;
import com.mycompany.mavenproject.databases.Database;
import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Remigija
 */
public class MovieService {

    private List<Account> alist = new Database().getAccountsDB();
    private List<Movie> movList = new Database().getMoviesDB();

    //for all movies
    public List<Movie> getMovies() {
        return movList;
    }

    //movies by movie id
    public Movie getMovie(int id) {
        return movList.get(id - 1);
    }

    //movies by account id
    public List<Movie> getMoviesByAccount(int AccountID) {
        return alist.get(AccountID - 1).getMoviesList();
    }

    //adding new movies
    public Movie createMovie(Movie m) {
        m.setId(movList.size() + 1);
        movList.add(m);
        System.out.println("201 - resource created with path: /movies/" + String.valueOf(m.getId()));
        return m;

    }

    public void deleteMovie(int id) {
        movList.remove(id - 1);

    }
    /*
    public Movie updateMovie(Movie m) {
       // m.getId();
       int movieid = m.getId();
       String movieName = m.getTitle();
      
       List<Account> alist = new Database().getAccountsDB();
        System.out.println("This is the update method");
        System.out.println("This is the movie being updated " + movieid);
        int movieOwned = alist.get(movieid).getId();
         
        System.out.println("The movie belongs to account " + movieOwned);
        System.out.println("Movie id in the database " + movList.get(movieid-1).getTitle());
        m.setTitle(movieName);
        movList.set(movieid-1, m);
        
        
        
            
        
       //System.out.println("New movie name" + movList.get(movieid-1).getTitle());


        return m;
    }
    */

    

    public List<Account> moveMovie(int movieid, int accountid, Account a ) {
        List<Customer> mlist = new Database().getCustomerDB();
        Movie m = new Movie();
      //  int oldID = accountid;
       // int movieId = m.getId();
      //List<Account> alist = new Database().getAccountsDB();
      
        String movieName = alist.get(accountid-1).getMoviesList().get(movieid-1).getTitle();
        System.out.println("This is the movie being updated " + movieid);
        System.out.println("This the movie name " +movieName);
        System.out.println("The movie belongs to account " + alist.get(accountid-1).getId());
        
        
      int newAccountID =  1;
       
      
      a.setId(newAccountID);
       alist.set(newAccountID, a);
      
      // alist.set(movieid-1, a);
       
       System.out.println("This movie " + movieName + " " + movieid + " has been moved to account " + alist.get(accountid-1).getId());
       System.out.println("The movie now belongs to account " + alist.get(accountid-1).getId());
        return alist;
       
        
       
        }
       
        
        
    }


