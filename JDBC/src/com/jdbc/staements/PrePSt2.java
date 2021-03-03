package com.jdbc.staements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PrePSt2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl", "scott", "tiger");
		//Statement statement = connection.createStatement();
		
		// update Records
				PreparedStatement preparedStatement = connection.prepareStatement("update emb set ename=? where ename=?");
				
				preparedStatement.setString(1, "ratan");
				preparedStatement.setString(2, "king");
				preparedStatement.executeUpdate();
				
				preparedStatement.setString(1, "raju");
				preparedStatement.setString(2, "cobra");
				int x = preparedStatement.executeUpdate();
				System.out.println(x);
				
	}

}
