package com.king.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.king.dao.WeatherDAO;
import com.king.dto.Weather;




@Path("/weatherService")
public class WeatherService {

	private WeatherDAO weatherDAO;
	
	public WeatherDAO getWeatherDAO() {
		return weatherDAO;
	}

	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	@GET
	@Path("/getWeatherByCity")
	@Produces({"application/json","application/xml"})
	public Weather getWeatherByCity(@QueryParam("city") String cityName)
	{
		return weatherDAO.getWeatherByCity(cityName);
	}
	
	
	@POST
	@Path("/createWeather")
	@Consumes({"application/json","application/xml"})
	public Response createWeather(Weather weather)
	{
		if(weather.getCityname().equals("hyd")){
			return Response.status(200).build();
		} else {
			return Response.status(400).build();
		}
	}
	
}
