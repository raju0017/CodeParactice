package com.king.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.king.dto.Weather;
import com.king.utils.ConnectionFactory;

public class WeatherDAO {

	public Weather getWeatherByCity(String cityName) {

		String name = cityName;
		Weather w = null;
		Connection con = ConnectionFactory.getConnection();

		try {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from weather where cityname='" + name + "'");

			if (rs.next()) {
				int cid = rs.getInt(1);
				int temp = rs.getInt(3);

				w = new Weather();
				w.setCityId(cid);
				w.setCityname(cityName);
				w.setTemparature(temp);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return w;
	}

}
