package com.king.webservices;

import javax.jws.WebService;

@WebService
public interface CalService {

	int add(int i, int j);
	int sub(int i, int j);
	
}

