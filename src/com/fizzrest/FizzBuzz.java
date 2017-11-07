package com.fizzrest;

import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbProperty;

public class FizzBuzz {
	List<Integer> fizz = new ArrayList<Integer>();
	List<Integer> buzz = new ArrayList<Integer>();
	List<Integer> fizzbuzz = new ArrayList<Integer>();
	
	public FizzBuzz(){}
	
	public void Populate(int upperBound) {

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
