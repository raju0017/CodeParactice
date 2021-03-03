package com.king.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.client.Service;

public class ProxyClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		
		URL url = new URL("http://localhost:8077/01_JAX_RPC_Axis1Service/services/CalService?wsdl");
		Service service = new Service();
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(url, service);
		int result = stub.add(20, 30);
		
		System.out.println(result);
	}
}
