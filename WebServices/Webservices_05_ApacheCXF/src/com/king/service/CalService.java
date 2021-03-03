package com.king.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.king.com/", portName = "CalServicePort", serviceName = "CalServiceService")
public class CalService {
	public int add(int i, int j)
	{
		return i+j;
	}

}
