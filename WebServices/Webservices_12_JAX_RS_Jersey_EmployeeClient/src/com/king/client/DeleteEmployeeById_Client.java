package com.king.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DeleteEmployeeById_Client {

	public static void main(String[] args) {

		Client client = Client.create();

		WebResource resource1 = client.resource(
				"http://localhost:9999/12_JAX_RS_Jersey_EmployeeService/rest/employeeService/deleteEmployeeById?eid="+103);
		
		ClientResponse response = resource1.get(ClientResponse.class);
		
		int statusCode = response.getStatus();
		String res = response.getEntity(String.class);
		
		System.out.println("STATUS CODE:  "+statusCode);
		System.out.println("OUTPUT:  "+res);	}

}
  