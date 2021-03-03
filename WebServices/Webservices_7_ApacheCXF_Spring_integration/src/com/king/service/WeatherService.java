package com.king.service;

public interface WeatherService {

	public Weather getWeatherByCityID(int cityId);
	public int getTempByWeather(Weather w); 
}
