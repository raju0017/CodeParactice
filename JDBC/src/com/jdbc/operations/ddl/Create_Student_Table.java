package com.jdbc.operations.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Student_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		String q = "create table student1(sid number(10) primary key,sname varchar2(255), semail varchar2(255), address varchar2(255))";
		int effectedRows = st.executeUpdate(q);
		con.close();
		System.out.println("effectedRows "+effectedRows);
		System.out.println("Teble created successfully");
	}
}
