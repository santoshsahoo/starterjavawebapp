package com.santoshsahoo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello/{name}")
public class HelloApi{
	@GET
	public String hello(@PathParam("name") String name) {
		return "Hello " + name;
	}
}