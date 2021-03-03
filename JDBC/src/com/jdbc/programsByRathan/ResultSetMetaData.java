package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetMetaData {
	public static void main(String[] args) throws Exception {
		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");

		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter table name for Retrive");
		String tname = scn.next();
		String str3 = "select * from " + tname;
		ResultSet rs = st.executeQuery("select * from " + tname);
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		String tableName = rsmd.getTableName(1);
		System.out.println("Table name...."+tableName);
		int count = rsmd.getColumnCount();
		System.out.println("Number of columns....." + count);
		System.out.println("*********************");
		for (int i = 1; i <= count; i++) {
			System.out.println("Column Name....." + rsmd.getColumnName(i));
			System.out.println("Data Type......." + rsmd.getColumnTypeName(i));
			System.out.println("Column Size....." + rsmd.getColumnDisplaySize(i));
			System.out.println("-----------------------");
		}
		con.close();
	}
}
