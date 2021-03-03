package com.king.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class GetEmployeetByIdClient {

	public static void main(String[] args) {
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client client = Client.create(clientConfig);
		
		WebResource resource1 = client.resource("http://localhost:9999/12_JAX_RS_Jersey_EmployeeService/rest/employeeService/getEmployeeById?eid=101");
		
		Employee e = resource1.accept(MediaType.APPLICATION_JSON).get(Employee.class);
		
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}
