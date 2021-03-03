package client;

import com.king.service.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class GetEmployeeById_Client {

	public static void main(String[] args) {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		WebResource resource1 = client.resource(
				"http://localhost:9999/13_JAX_WS_Xml/rest/employeeService/getEmployeeById?eid=101");

		Employee emp = resource1.accept("application/xml").get(Employee.class);

		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}
