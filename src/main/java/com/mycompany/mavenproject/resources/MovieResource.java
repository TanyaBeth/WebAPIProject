/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.resources;

import com.mycompany.mavenproject.models.Account;
import com.mycompany.mavenproject.models.Movie;
import com.mycompany.mavenproject.services.MovieService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author Remigija
 */

@Path("/movies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MovieResource {

    private MovieService movieService = new MovieService();

    @GET
    public List<Movie> getMovies(@PathParam("accountId") int id) {
        System.out.println("Get all movies for account... " + id);
        return movieService.getMovies();
    }

    @GET
    @Path("/{movieId}")
    public Movie getMovie(@PathParam("movieId") int id) {
        System.out.println("Get all movies for id... " + id);
        return movieService.getMovie(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Movie postMovie(Movie m) {
        return movieService.createMovie(m);
    }

    @DELETE
    @Path("/{movieId}")
    public void deleteMovie(@PathParam("movieId") int id) {
        System.out.println("Deleting this movie " + id);
        movieService.deleteMovie(id);
        
    }
    /*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{movieId}")
    public Movie updateMovie(@PathParam("movieId") int id, Movie m) {
       
        return movieService.updateMovie(m);
    }
    */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{movieId}")
    public List<Account> moveMovie(@PathParam("movieId") int movieid, @PathParam("accountId") int accountid, Account a) {
       
        return movieService.moveMovie(movieid,accountid, a);
    }
    
    

}
