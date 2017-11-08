package test;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.fizzrest.FizzBuzzService;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import static org.junit.Assert.assertEquals;

public class WebServiceTester extends JerseyTest {

    @Override
    public Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY); 
        return new ResourceConfig(FizzBuzzService.class);
    }

    @Test
    public void testReturnedJson() {
        Response output = target("/15").request().get();
        System.out.println();
        assertEquals("should return status 200", 200, output.getStatus());
        assertEquals("Should return Json",output.readEntity(String.class),"{\"Buzz\":[5,10],\"Fizz\":[3,6,9,12],\"FizzBuzz\":[15]}");
        
    }
    
    @Test
    public void testOutsideRange() {
        Response output = target("/-1").request().get();
        assertEquals("should return status 401", 401, output.getStatus());
    }
    @Test
    public void testInvalidInput() {
        Response output = target("/foo").request().get();
        assertEquals("should return status 401", 401, output.getStatus());
    }
    @Test
    public void testFloatInput() {
        Response output = target("/3.14").request().get();
        assertEquals("should return status 401", 401, output.getStatus());
    }
    

}
