/**
 * CalService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.king.webservices;

import javax.jws.WebService;

@WebService(name = "CalService", targetNamespace = "http://webservices.king.com/")
public interface CalService extends java.rmi.Remote {
    public int add(int a, int b) throws java.rmi.RemoteException;
}
