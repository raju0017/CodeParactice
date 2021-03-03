
package com.king.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.king.com/", portName = "WeatherServiceImplPort", serviceName = "WeatherServiceImplService")
public class WeatherServiceImpl implements WeatherService {

	WeatherDAO weatherDAO;// = new WeatherDAO();
	
	
	
	public WeatherDAO getWeatherDAO() {
		return weatherDAO;
	}

	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	@Override
	public Weather getWeatherByCityID(int cityId) {
		
		return weatherDAO.getWeatherByCityId(cityId);
	}

	@Override
	public int getTempByWeather(Weather w) {
		
		return weatherDAO.getTempByWeather(w);
	}
}
