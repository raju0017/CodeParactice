
package com.king.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.8
 * Sun Feb 05 15:51:01 IST 2017
 * Generated source version: 2.7.8
 */

@XmlRootElement(name = "getWeatherByCityIDResponse", namespace = "http://service.king.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherByCityIDResponse", namespace = "http://service.king.com/")

public class GetWeatherByCityIDResponse {

    @XmlElement(name = "return")
    private com.king.service.Weather _return;

    public com.king.service.Weather getReturn() {
        return this._return;
    }

    public void setReturn(com.king.service.Weather new_return)  {
        this._return = new_return;
    }

}
