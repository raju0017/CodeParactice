package com.king.ws;

public interface WeatherService {

	public Weather getWeatherByCityID(int cityId);
	public int getTempByWeather(Weather w); 
}
