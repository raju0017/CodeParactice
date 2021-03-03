package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseMetadata {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("java developer jdbc is started ");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Max username length: " + dbmd.getMaxUserNameLength());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
