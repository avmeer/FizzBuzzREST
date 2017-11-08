package com.fizzrest;  

import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/") 

public class FizzBuzzService {  
   
   @GET
   @Path("/{upperBound}")
   @Produces(MediaType.APPLICATION_JSON)
   public FizzBuzz getUser(@PathParam("upperBound") int upperBound){
      FizzBuzz fizz = new FizzBuzz();
      fizz.Populate(upperBound);
	return fizz;
   }
}