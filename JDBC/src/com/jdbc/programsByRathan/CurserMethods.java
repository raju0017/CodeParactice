package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CurserMethods {
	public static void main(String[] args) throws Exception {
		
		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter table name for Retrive");
		String tname = scn.next();
		String str3 = "select * from " + tname;
		ResultSet rs = st.executeQuery(str3);
		rs.last();
		System.out.println(rs.getString(2));
		rs.first();
		System.out.println(rs.getString(2));
		rs.absolute(3);
		System.out.println(rs.getString(2));
		rs.previous();
		System.out.println(rs.getString(2));
		con.close();
	}

}
