/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.resources;


import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Customer;
import com.mycompany.mavenproject.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;


   @Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
   
public class CustomerResource {
    
   private CustomerService customerService = new CustomerService();
   
    @GET
    public List<Customer> getCustomers(@PathParam("customerId") int id) {
        System.out.println("Show customers "+id);
	return customerService.getAllCustomers();
    }
    
   
   @GET
    @Path("/{customerId}")
    public Customer getCustomer(@PathParam("customerId") int id) {
    	System.out.println("getCustomerByID..."+id);
	return customerService.getCustomerByID(id);
    }
    @Path("/{customerId}/accounts")
    public AccountResource getAccountsResource() {
	System.out.println("Getting accounts subresoruces...");
	return new AccountResource();
    }
    

    
      @POST
      @Consumes (MediaType.APPLICATION_JSON)
       public Account postMessage (Account m){
        return customerService.createAccount(m);
    }
    



}
    
    