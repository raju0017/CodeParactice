package com.king.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {

	private int cityId;
	private String cityname;
	private int temparature;

	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getTemparature() {
		return temparature;
	}
	public void setTemparature(int temparature) {
		this.temparature = temparature;
	}

	
}

