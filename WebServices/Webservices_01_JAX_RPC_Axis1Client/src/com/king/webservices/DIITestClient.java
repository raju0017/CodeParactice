package com.king.webservices;

import javax.xml.namespace.QName;


public class DIITestClient {

	public static void main(String[] args) throws Exception {
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		org.apache.axis.client.Call client = (org.apache.axis.client.Call)service.createCall();
		
		client.setTargetEndpointAddress("http://localhost:8077/01_JAX_RPC_Axis1Service/services/CalService?wsdl");

		QName qName = new QName("CalService", "add");
		client.setOperationName(qName);
		
		client.addParameter("in0", 
				javax.xml.rpc.encoding.XMLType.XSD_INT, 
				javax.xml.rpc.ParameterMode.IN);
		
		client.addParameter("in1", 
				javax.xml.rpc.encoding.XMLType.XSD_INT, 
				javax.xml.rpc.ParameterMode.IN);
		
		client.setReturnType(javax.xml.rpc.encoding.XMLType.XSD_INT);
		
		Object params [] = {new Integer(20), new Integer(50)};
		Integer res = (Integer)client.invoke(params);
		
		System.out.println(res);
	}
	
}
