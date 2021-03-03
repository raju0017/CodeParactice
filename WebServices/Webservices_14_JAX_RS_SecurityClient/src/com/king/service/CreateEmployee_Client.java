package com.king.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

public class CreateEmployee_Client {

	public static void main(String[] args) {

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);
		
		client.addFilter(new HTTPBasicAuthFilter("king", "0017"));// only this line for authentication

		WebResource resource1 = client.resource(
				"http://localhost:9999/14_JAX_RS_SecurityService/rest/employeeService/createEmployee");

		Employee emp = new Employee();

		emp.setEid(200);
		emp.setName("dileep");
		emp.setSalary(50000);
		
		ClientResponse response = resource1.type("application/json").post(ClientResponse.class, emp);
		
		int statusCode = response.getStatus();
		
		String resp = response.getEntity(String.class);
		
		System.out.println("STATUS CODE:  "+statusCode);
		System.out.println("OUTPUT:  "+resp);
	}

}
