package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionMgmt {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", " hr");
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(104,'kamal',8000)");
			st.executeUpdate("insert into emp values(105,'nandu',9000)");
			st.executeUpdate("insert into emp values(106,'indhu',9500)");
			con.commit();
			System.out.println("Transaction success");
		} catch (Exception e) {
			try {
				con.rollback();
				System.out.println("Transaction failure");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
