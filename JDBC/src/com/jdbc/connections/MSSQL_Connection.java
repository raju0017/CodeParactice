package com.jdbc.connections;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MSSQL_Connection {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=master; user=sa;password=admin@123";
			java.sql.Connection con = DriverManager.getConnection(url);
			Statement s1 = con.createStatement();
			ResultSet rs = s1.executeQuery("SELECT TOP 1 * FROM MSreplication_options");
			System.out.println("King");
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getString(3));
				}
			}

			// String result = new result[20];

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
