
package com.king.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.8
 * Mon Jun 26 20:02:26 IST 2017
 * Generated source version: 2.7.8
 */

@XmlRootElement(name = "getWeatherByCityID", namespace = "http://service.king.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherByCityID", namespace = "http://service.king.com/")

public class GetWeatherByCityID {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}
