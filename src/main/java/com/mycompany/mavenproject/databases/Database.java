/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.databases;

import com.mycompany.mavenproject.models.Customer;
import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alena
 * @author Remigija
 */
public class Database {
    public static List<Customer> customerDB = new ArrayList<>();//database for Customers
    public static List<Account> accountDB = new ArrayList<>();//database for Accounts
    public static List<Movie> movieDB = new ArrayList<>();//database for movies
    public static boolean init = true;

   public Database () {
     if (init) {
       
        Customer m1 = new Customer(1,"Manuel", "Manuel@gmail.com", "33 Yellow Avenue", accountDB);//items in the the Customer data base         
        customerDB.add(m1);
        Account c1 = new Account (1,"Angela", "321sewa!", movieDB);  
        Account c2 = new Account (2,"Mike", "glp;£dfd", movieDB);        
        accountDB.add(c1);
        accountDB.add(c2);
        
        Movie mov1 = new Movie (4, "Title1", "W", "Description is not available1");

        
        movieDB.add(mov1);
        
        init = false;
        
        

  } 
   }
  public static List<Customer> getCustomerDB() {
        return customerDB;
  }
    
  public static List<Account> getAccountsDB() {
        return accountDB;
  }
  
  public static List<Movie> getMoviesDB(){
      return movieDB; 
  }
  
}

