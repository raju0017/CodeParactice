package com.jdbc.operations.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_data_from_Student_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.23:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		String sql = "select * from student";
		ResultSet data = st.executeQuery(sql);
		int count = 0;
		while (data.next()) {
			count++;
			// by calling column numbers
			//System.out.println(data.getInt(1) + "====" + data.getString(2) + "====" + data.getString(3) + "==== "+ data.getString(4));
			// by calling column names
			System.out.println(data.getInt("sid")+"===="+data.getString("sname")+"===="+data.getString("semail")+"===="+data.getString("address"));
		}

		System.out.println("total rows fetched= " + count);
		System.out.println("data fetched Successfully");

	}

}
