/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.services;

import com.mycompany.mavenproject.databases.Database;
import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    //public static List<Customer> list = new ArrayList<>();
    
 private List<Customer> mlist = new Database().getCustomerDB();
 private List<Account> clist = new Database().getAccountsDB();   
    
    public List<Customer> getAllCustomers() {
        return mlist;
    }
 
    
    public Customer getCustomerByID(int id) {
        return mlist.get(id-1);
    }
    
    
    public Account createAccount(Account m) {
        m.setId(clist.size()+1);
        clist.add(m);
        System.out.println("201 – resource created with path:/customers/" +String.valueOf(m.getId()));
 return m;
} 
    public List<Customer> getSearchCustomers(String email, String name) {
 List<Customer> matcheslist = new ArrayList<>();
 for (Customer q: getAllCustomers()) {
if ((email == null || q.getEmail().equals(email))
&& (name == null || q.getName().equals(name)))
 {
matcheslist.add(q);
 }
 }
 return matcheslist;
 } 



 
    
}
