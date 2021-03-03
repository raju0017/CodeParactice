package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Typr1Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load or register driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcdriver");
		Connection con = DriverManager.getConnection("jdbc:odbc;DSNname","UN","PWD");
		
	}
}
