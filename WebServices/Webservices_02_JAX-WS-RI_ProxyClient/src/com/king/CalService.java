
package com.king;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.king.webservices.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalService", targetNamespace = "http://webservices.king.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://webservices.king.com/", className = "com.king.webservices.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webservices.king.com/", className = "com.king.webservices.AddResponse")
    @Action(input = "http://webservices.king.com/CalService/addRequest", output = "http://webservices.king.com/CalService/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://webservices.king.com/", className = "com.king.webservices.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://webservices.king.com/", className = "com.king.webservices.SubResponse")
    @Action(input = "http://webservices.king.com/CalService/subRequest", output = "http://webservices.king.com/CalService/subResponse")
    public int sub(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
