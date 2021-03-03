package com.king.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-02-05T16:27:26.795+05:30
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://service.king.com/", name = "WeatherServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherServiceImpl {

    @WebMethod
    @RequestWrapper(localName = "getWeatherByCityID", targetNamespace = "http://service.king.com/", className = "com.king.service.GetWeatherByCityID")
    @ResponseWrapper(localName = "getWeatherByCityIDResponse", targetNamespace = "http://service.king.com/", className = "com.king.service.GetWeatherByCityIDResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.king.service.Weather getWeatherByCityID(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getTempByWeather", targetNamespace = "http://service.king.com/", className = "com.king.service.GetTempByWeather")
    @ResponseWrapper(localName = "getTempByWeatherResponse", targetNamespace = "http://service.king.com/", className = "com.king.service.GetTempByWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int getTempByWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        com.king.service.Weather arg0
    );
}
