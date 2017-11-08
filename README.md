# Fizzbuzz REST application

This service consumes an upper boundry as a path parameter and determines which numbers to print "Fizz", "Buzz", and "FizzBuzz". 


HTTP GET - http://localhost:8080/fizzbuzz/15

{"Buzz":[5,10],"Fizz":[3,6,9,12],"FizzBuzz":[15]}


Non integer or negative values will return an error.

This application depends on [Jersey](https://jersey.github.io/).