
package com.king.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.king.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWeatherByCityIDResponse_QNAME = new QName("http://service.king.com/", "getWeatherByCityIDResponse");
    private final static QName _GetWeatherByCityID_QNAME = new QName("http://service.king.com/", "getWeatherByCityID");
    private final static QName _GetTempByWeather_QNAME = new QName("http://service.king.com/", "getTempByWeather");
    private final static QName _GetTempByWeatherResponse_QNAME = new QName("http://service.king.com/", "getTempByWeatherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.king.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTempByWeatherResponse }
     * 
     */
    public GetTempByWeatherResponse createGetTempByWeatherResponse() {
        return new GetTempByWeatherResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByCityID }
     * 
     */
    public GetWeatherByCityID createGetWeatherByCityID() {
        return new GetWeatherByCityID();
    }

    /**
     * Create an instance of {@link GetWeatherByCityIDResponse }
     * 
     */
    public GetWeatherByCityIDResponse createGetWeatherByCityIDResponse() {
        return new GetWeatherByCityIDResponse();
    }

    /**
     * Create an instance of {@link GetTempByWeather }
     * 
     */
    public GetTempByWeather createGetTempByWeather() {
        return new GetTempByWeather();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCityIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.king.com/", name = "getWeatherByCityIDResponse")
    public JAXBElement<GetWeatherByCityIDResponse> createGetWeatherByCityIDResponse(GetWeatherByCityIDResponse value) {
        return new JAXBElement<GetWeatherByCityIDResponse>(_GetWeatherByCityIDResponse_QNAME, GetWeatherByCityIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCityID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.king.com/", name = "getWeatherByCityID")
    public JAXBElement<GetWeatherByCityID> createGetWeatherByCityID(GetWeatherByCityID value) {
        return new JAXBElement<GetWeatherByCityID>(_GetWeatherByCityID_QNAME, GetWeatherByCityID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTempByWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.king.com/", name = "getTempByWeather")
    public JAXBElement<GetTempByWeather> createGetTempByWeather(GetTempByWeather value) {
        return new JAXBElement<GetTempByWeather>(_GetTempByWeather_QNAME, GetTempByWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTempByWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.king.com/", name = "getTempByWeatherResponse")
    public JAXBElement<GetTempByWeatherResponse> createGetTempByWeatherResponse(GetTempByWeatherResponse value) {
        return new JAXBElement<GetTempByWeatherResponse>(_GetTempByWeatherResponse_QNAME, GetTempByWeatherResponse.class, null, value);
    }

}
