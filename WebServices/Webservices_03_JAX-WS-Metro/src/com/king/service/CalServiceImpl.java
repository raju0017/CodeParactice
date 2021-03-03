package com.king.service;

import javax.jws.WebService;



@WebService(endpointInterface = "com.king.service.CalService", 
				serviceName = "CalServiceImpl", 
				targetNamespace = "http://www.king.com")
public class CalServiceImpl implements CalService{

	@Override
	public int add(int i, int j) {
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		return i-j;
	}
}
