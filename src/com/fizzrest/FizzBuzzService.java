package com.fizzrest;  

import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import com.exception.FizzBuzzException;  
@Path("/") 

public class FizzBuzzService {  
	private static int MAXVAL = 10000;
	private static int MINVAL = 1;
	
   @GET
   @Path("/{upperBound}")
   @Produces(MediaType.APPLICATION_JSON)
   public FizzBuzz getUser(@PathParam("upperBound") String param) throws FizzBuzzException{
	   Integer upperBound;
	    try {
	    	upperBound = Integer.parseInt(param);
	    } catch (Exception e) {
	    	throw new FizzBuzzException("Input should be an integer");
	    }
	   
	   if(upperBound>MAXVAL || upperBound < MINVAL) {
		   throw new FizzBuzzException("Number should be from "+MINVAL+" to "+MAXVAL);
	   }
		FizzBuzz fizz = new FizzBuzz();
		fizz.Populate(upperBound);
		return fizz;
	
   }
}