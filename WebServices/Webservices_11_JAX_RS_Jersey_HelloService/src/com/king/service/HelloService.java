package com.king.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


@Path("/helloService")
public class HelloService {

	@Path("/sayHello/{age}")
	@GET
	public String sayhello(@QueryParam("name") String name, @PathParam("age") int age)
	{
		return 	"Hello..."+name+"  your age is "+age;
	}
	
}
