package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL_Connection {

	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			// step2 connecting 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// here test is database name, root is user name and password
			// step3 create the statement object
			Statement stmt = con.createStatement();
			// step4 executing query
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			con.close();
			System.out.println("MySQL");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
