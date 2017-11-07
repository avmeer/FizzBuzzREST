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
      
      tester.testFizzbuzz50();
      
      tester.testFizzbuzz100();
   }
   
   private void testFizzbuzz15(){
	   
	  String expectedJson = "{\"Buzz\":[5,10],\"Fizz\":[3,6,9,12],\"FizzBuzz\":[15]}";
	   
      String json = client
         .target("http://localhost:8080/fizzbuzz/15")
         .request(MediaType.APPLICATION_JSON)
         .get(String.class);

      String result = FAIL;
      
      if(json.compareTo(expectedJson) == 0){
         result = PASS;
      }
      System.out.println("Test case name: test input 15, Result: " + result );
   }
   
   private void testFizzbuzz50(){
	   
	  String expectedJson = "{\"Buzz\":[5,10,20,25,35,40,50],\"Fizz\":[3,6,9,12,18,21,24,27,33,36,39,42,48],\"FizzBuzz\":[15,30,45]}";
	   
      String json = client
         .target("http://localhost:8080/fizzbuzz/50")
         .request(MediaType.APPLICATION_JSON)
         .get(String.class);

      String result = FAIL;
      
      if(json.compareTo(expectedJson) == 0){
         result = PASS;
      }
      System.out.println("Test case name: test input 50, Result: " + result );
   }
   
   private void testFizzbuzz100(){
	   
	  String expectedJson = "{\"Buzz\":[5,10,20,25,35,40,50,55,65,70,80,85,95,100],\"Fizz\":[3,6,9,12,18,21,24,27,33,36,39,42,48,51,54,57,63,66,69,72,78,81,84,87,93,96,99],\"FizzBuzz\":[15,30,45,60,75,90]}";
	   
      String json = client
         .target("http://localhost:8080/fizzbuzz/100")
         .request(MediaType.APPLICATION_JSON)
         .get(String.class);

      String result = FAIL;
      
      if(json.compareTo(expectedJson) == 0){
         result = PASS;
      }
      System.out.println("Test case name: test input 100, Result: " + result );
   }
 
}