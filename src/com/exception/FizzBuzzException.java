package com.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class FizzBuzzException extends WebApplicationException  {

	public FizzBuzzException(String message) {
        super(Response.status(Response.Status.UNAUTHORIZED)
            .entity(message).type(MediaType.TEXT_PLAIN).build());
    }
}