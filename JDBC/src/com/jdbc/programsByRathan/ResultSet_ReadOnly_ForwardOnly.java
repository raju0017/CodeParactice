package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_ReadOnly_ForwardOnly {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();

		System.out.println("***********retrive the data ****************");

		String str3 = "select * from student";
		ResultSet rs = st.executeQuery(str3);
		while (rs.next()) {
			System.out.println(rs.getInt("sid"));
		}
	}
}
