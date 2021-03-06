 package com.king.webservices;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.king.CalService;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/02_JAX_WS_RI_CalService/calService?wsdl");
		QName qname = new QName("http://www.king.com", "CalServiceImpl");
		Service service = Service.create(url, qname);
		
		//here we need to pass generated service endpoint interface(SEI)
		CalService ser = service.getPort(com.king.CalService.class);
		
		int res = ser.add(20, 400);
		System.out.println(res);
		
	}
}
