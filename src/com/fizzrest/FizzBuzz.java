package com.fizzrest;

import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbProperty;

public class FizzBuzz {
	//Store numbers for their respective 
	List<Integer> fizz = new ArrayList<Integer>();
	List<Integer> buzz = new ArrayList<Integer>();
	List<Integer> fizzbuzz = new ArrayList<Integer>();
	
	public FizzBuzz(){}
	
	public void Populate(int upperBound) {
		for(int i = 1; i <= upperBound; i++) {
			if(i%3 == 0 && i%5==0) {
				fizzbuzz.add(i);
			}
			
			else if(i%3 == 0) {
				fizz.add(i);
			}
			
			else if(i%5== 0) {
				buzz.add(i);
			}
		}
	}
	
	@JsonbProperty("Fizz")
    public List<Integer> getFizz() {
        return fizz;
    }
	@JsonbProperty("Buzz")
    public List<Integer> getBuzz() {
        return buzz;
    }
	@JsonbProperty("FizzBuzz")
    public List<Integer> getFizzBuzz() {
        return fizzbuzz;
    }
}
