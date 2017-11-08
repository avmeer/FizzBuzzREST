# Fizzbuzz REST application

This service consumes an upper boundary as a path parameter. It returns a Json which represents which numbers should print "Fizz", "Buzz", and "FizzBuzz". 


This service supports one GET endpoint:
http://localhost:8080/fizzbuzz/{Upper bound as integer}

**Example Run**
HTTP GET - http://localhost:8080/fizzbuzz/15

{"Buzz":[5,10],"Fizz":[3,6,9,12],"FizzBuzz":[15]}


Non integer or negative values will return an error.

Number must be between 1 and 10000

This application depends on [Jersey](https://jersey.github.io/).