package com.king.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class DeleteEmployeeById_Client {

	public static void main(String[] args) {

		Client client = Client.create();
		
		client.addFilter(new HTTPBasicAuthFilter("king", "0017"));// only this line for authentication

		WebResource resource1 = client.resource(
				"http://localhost:9999/14_JAX_RS_SecurityService/rest/employeeService/deleteEmployeeById?eid="+200);
		
		ClientResponse response = resource1.get(ClientResponse.class);
		
		int statusCode = response.getStatus();
		String res = response.getEntity(String.class);
		
		System.out.println("STATUS CODE:  "+statusCode);
		System.out.println("OUTPUT:  "+res);	}

}
 