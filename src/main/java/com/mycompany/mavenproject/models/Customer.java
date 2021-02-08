/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.models;

import com.mycompany.mavenproject.databases.Database;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private int id;
    private String address;
    private String email;
    private String name;
    private List <Account> accounts;
    
    public Customer() {
    }

    public Customer(int id,String name, String address, String email, List <Account> accounts) {
        this.id = id;
        this.name = name;
         this.address = address;
        this.email = email;
        this.accounts = accounts;
        
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

 
  

    
    
}
