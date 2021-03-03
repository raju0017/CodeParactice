package com.jdbc.usefulOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement st = con.createStatement();
		String sql1 = "insert into student values(555,'king','king@gmail.com', 'bangalore')";
		String sql2 = "insert into student values(666,'cobra','cobra@gmail.com', 'hyd')";
		String sql3 = "insert into student values(777,'dravid','dravid@gmail.com', 'chennai')";
		String sql4 = "insert into student values(888,'sachin','sachin@gmail.com', 'atp')";

		st.addBatch(sql1);
		st.addBatch(sql2);
		st.addBatch(sql3);
		st.addBatch(sql4);

		int[] arr = st.executeBatch();

		System.out.println("batch Updated successfully");

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
