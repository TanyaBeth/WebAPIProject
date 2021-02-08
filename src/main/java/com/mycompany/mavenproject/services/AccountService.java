/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.services;

import com.mycompany.mavenproject.databases.Database;
import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Customer;
import com.mycompany.mavenproject.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    //public static List<Account> list = new ArrayList<>();
    
 
    private List<Customer> mlist = new Database().getCustomerDB();
    private List<Account> clist = new Database().getAccountsDB();
    
    
    public List<Account> getAllAccounts() {
        return clist;
    }
    public List<Account> getAllAccountByCustomer(int CustomerID) {
        return mlist.get(CustomerID-1).getAccounts();
    }
     public Account createAccount(Account m) {
        m.setId(clist.size()+1);
        clist.add(m);
        System.out.println("201 – resource created with path:/customers/" +String.valueOf(m.getId()));
 return m;
} 
    public Account getAccountByID(int id) {
        return clist.get(id-1);
    }

    
   
}

