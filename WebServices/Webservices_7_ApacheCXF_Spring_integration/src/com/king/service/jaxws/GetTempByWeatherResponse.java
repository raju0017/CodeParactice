
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

@XmlRootElement(name = "getTempByWeatherResponse", namespace = "http://service.king.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempByWeatherResponse", namespace = "http://service.king.com/")

public class GetTempByWeatherResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}
