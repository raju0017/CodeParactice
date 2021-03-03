package com.king.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class HelloServiceClient {

	public static void main(String[] args) {
		
		Client client = Client.create();
		WebResource resource1 = 
				client.resource("http://localhost:8082/Webservices_11_JAX_RS_Jersey_HelloService/rest/helloService/sayHello/27?name=nagaraj");
		String result = resource1.get(String.class);
		
		System.out.println(result);
	}
}
