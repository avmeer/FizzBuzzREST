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
   public int getUser(@PathParam("upperBound") int upperBound){
	  return upperBound;
   }
}