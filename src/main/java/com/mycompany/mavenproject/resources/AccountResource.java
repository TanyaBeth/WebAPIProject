/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.resources;

import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Movie;
import com.mycompany.mavenproject.services.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {
    
    private AccountService accountService = new AccountService();
    
	
    @GET
    public List<Account> getAccounts(@PathParam("accountId") int id) {
        System.out.println("Show accounts "+id);
	return accountService.getAllAccounts();
    }
	
    @GET
    @Path("/{accountId}")
    public Account getAccount(@PathParam("accountId") int id) {
    	System.out.println("getAccountByID..."+id);
	return accountService.getAccountByID(id);
    }
       @POST
      @Consumes (MediaType.APPLICATION_JSON)
       public Account postMessage (Account m){
        return accountService.createAccount(m);
    }
       
    @Path ("/{accountId}/movies")
    public MovieResource getMovieResource(){
        System.out.println("Getting movie subresources...");
        
        return new MovieResource();
    }
   
    
    
 
}
    
    