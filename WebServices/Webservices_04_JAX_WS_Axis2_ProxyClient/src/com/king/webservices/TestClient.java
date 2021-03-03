package com.king.webservices;

import java.rmi.RemoteException;

public class TestClient {

	public static void main(String[] args) throws RemoteException {

		CalServiceStub stub = new CalServiceStub();
		
		//code to invoke add()
		
		CalServiceStub.Add params = new CalServiceStub.Add();
		params.setI(30);
		params.setJ(80);
		
		CalServiceStub.AddResponse res = stub.add(params);
		
		int result = res.get_return();
		
		System.out.println(result);
	}

}
