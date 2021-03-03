package com.king.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherDAO {

	private Connection getConnection() {
		Connection con = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public Weather getWeatherByCityId(int cityId) {
		Weather w = null;

		try {

			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from weather where cid='"+cityId+"'");
			
			System.out.println("at statement excution");

			if (rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int temp = rs.getInt(3);

				w = new Weather();
				w.setCityId(cid);
				w.setCityname(cname);
				w.setTemparature(temp);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return w;
	}

	public int getTempByWeather(Weather w) {

		String cname = w.getCityname();
		int temp = -100;

		try {

			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from weather where cityName='"+cname+"'");

			if (rs.next()) {
				 temp = rs.getInt(3);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return temp;

	}
}
