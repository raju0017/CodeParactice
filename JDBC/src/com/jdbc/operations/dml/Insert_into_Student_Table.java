package com.jdbc.operations.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_into_Student_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl","hr","hr");
		Statement st = con.createStatement();
		String sql1 = "insert into student values(545,'abc','abc@gmail.com', 'bangalore')";
		String sql2 = "insert into student values(786,'lmn','lmn@gmail.com', 'hyd')";
		String sql3 = "insert into student values(087,'pqr','pqr@gmail.com', 'chennai')";
		String sql4 = "insert into student values(098,'xyz','xyz@gmail.com', 'atp')";

		st.executeUpdate(sql1);
		st.executeUpdate(sql2);
		st.executeUpdate(sql3);
		st.executeUpdate(sql4);

		System.out.println("values are inserted successfully");
		
		
		con.close();
	}

}
