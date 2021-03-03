package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class RollBack {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", " hr");
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.executeUpdate("insert into student values(105,'srinu',55,'hyd')");
			Savepoint sp = con.setSavepoint();
			st.executeUpdate("insert into student values(106,'amala',75, 'bang')");
			con.rollback(sp);
			st.executeUpdate("insert into student values(107,'sania',80, 'kokata')");
			con.commit();
		} catch (Exception e) {
			try {
				e.printStackTrace();
				con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		System.out.println(" table transaction completed!");
	}
}
