package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePoint {
	public static void main(String[] args) {
		Connection con = null;
		try {
			System.out.println("java developer jdbc is started ");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(123,'baji',10000)");
			Savepoint save = con.setSavepoint("aaa");
			st.executeUpdate("insert into emp values(321,'hassi',20000)");
			con.rollback(save);
			con.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
