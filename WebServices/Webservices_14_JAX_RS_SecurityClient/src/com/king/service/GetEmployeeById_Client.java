package com.king.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

public class GetEmployeeById_Client {
	public static void main(String[] args) {

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);
		client.addFilter(new HTTPBasicAuthFilter("king", "0017"));// only this line for authentication

		WebResource resource1 = client.resource(
				"http://localhost:9999/14_JAX_RS_SecurityService/rest/employeeService/getEmployeeById?eid=101");

		Employee emp = resource1.accept("application/json").get(Employee.class);

		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}

}
 