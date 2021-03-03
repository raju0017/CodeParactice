package com.king.service;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClient {

	public static void main(String[] args) {

		WebClient client = WebClient.create(
				"http://localhost:9999/15_JAX_RS_ApacheCXF_Service/services/weatherServiceRestPort/weatherService/getWeatherByCity?city=HYD");

		Weather w = client.accept("application/xml").get(Weather.class);
		
		System.out.println(w.getCityId());
		System.out.println(w.getCityname());
		System.out.println(w.getTemparature());
	}
}
