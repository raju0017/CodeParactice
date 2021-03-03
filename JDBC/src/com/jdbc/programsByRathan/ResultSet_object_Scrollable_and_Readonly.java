package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSet_object_Scrollable_and_Readonly {
	public static void main(String[] args) throws Exception {
		
		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		System.out.println("*********** retrive the data ****************");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter table name for Retrive");
		String tname = scn.next();
		String str3 = "select * from " + tname;
		ResultSet rs = st.executeQuery(str3);
		rs.afterLast();// the cursor is pointing to the after last record
		while (rs.previous()) {
			System.out.println(rs.getInt(1));
		}
	}
}
