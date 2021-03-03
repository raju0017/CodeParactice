package com.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Connection_interface {
	public static void main(String[] args) {
		try {
			// step1 load the driver class
			// racle.jdbc.driver ---  package name
			//OracleDriver  -- class name
			Class.forName("oracle.jdbc.driver.OracleDriver");
					//or
			 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
					
			
			// step2 create the connection object
			//jdbc:oracle:thin:@192.168.3.23:1521:orcl -- url,
			//@192.168.3.23 -- IP address
			//1521 -- default port number
			// thin -- driver used
			//orcl -- service provider
			//"scott", "tiger" username and password
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl", "scott", "tiger");
			// step3 creating statement
			Statement stmt = con.createStatement();
			// write query
			String q1 = "create table emp2 (eno number, ename varchar2(20), esal number)";
			// execute query
			int i = stmt.executeUpdate(q1);
			System.out.println("Rows affected = " + i);
			// commit transaction
			con.commit();
			// close connection
			con.close();
			System.out.println("success");
			
			// =========  OR ====================
			
			/*JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			rowSet.setUrl("jdbc:oracle:thin:@192.168.2.19:1521:orcl");
			rowSet.setUsername("system");
			rowSet.setPassword("system");
			rowSet.setCommand("select * from emp");
			
			rowSet.execute();
			rowSet.next();
			System.out.println(rowSet.getString(2));*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
