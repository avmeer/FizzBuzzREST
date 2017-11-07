package com.fizzrest;

import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class WebServiceTester  {

   private Client client;
   private static final String PASS = "pass";
   private static final String FAIL = "fail";

   private void init(){
      this.client = ClientBuilder.newClient();
   }

   public static void main(String[] args){
      WebServiceTester tester = new WebServiceTester();
      //initialize the tester
      tester.init();
      //test the Json is created and returned properly
      tester.testFizzbuzz15();
   }
   
   private void testFizzbuzz15(){
	   
	  ArrayList<Integer> expectedBuzz = new ArrayList<Integer>(Arrays.asList(3,6,9,12));
	  ArrayList<Integer> expectedFizz= new ArrayList<Integer>(Arrays.asList(5,10));
	  ArrayList<Integer> expectedFizzBuzz= new ArrayList<Integer>(Arrays.asList(15));
	  
      FizzBuzz fizz = client
         .target("http://localhost:8080/fizzbuzz/15")
         .request(MediaType.APPLICATION_JSON)
         .get(new GenericType<FizzBuzz>() {});

      String result = FAIL;
      
      if(fizz.getBuzz().equals(expectedBuzz) && fizz.getFizz().equals(expectedFizz) && fizz.getFizzBuzz().equals(expectedFizzBuzz)){
         result = PASS;
      }
      System.out.println("Test case name: test input 15, Result: " + result );
   }
 
}