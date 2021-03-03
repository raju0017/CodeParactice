package com.jdbc.operations.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Student_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl","hr","hr");
		Statement st = con.createStatement();
		String sql = "update student set address='kurnool' where sid=444";
		int i = st.executeUpdate(sql);
		System.out.println("affected rows "+i);
		System.out.println("teble updated successfully");
	}
}
