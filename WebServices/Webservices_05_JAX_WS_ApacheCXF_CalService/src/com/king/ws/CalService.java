package com.king.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.king.com/", portName = "CalServicePort", serviceName = "CalServiceService")
public class CalService {

	public int add(int a, int b)
	{
		return a+b;
	}
}
