package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Nagaraj
 *
 */
public class Oracle_Connection {
	public static void main(String[] args) throws Exception {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl", "scott", "tiger");
			// step3 create the statement object
			boolean commit = con.getAutoCommit();System.out.println(commit);
			
			Statement stmt = con.createStatement();
			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from emp");
			int type = rs.getType();
			System.out.println(type);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			// step5 close the connection object
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
