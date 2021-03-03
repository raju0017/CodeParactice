package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BatchUpdation {
	public static void main(String[] args) throws Exception {

		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		st.addBatch("insert into emp values(555,'ramesh',4000)");
		st.addBatch("update emp set esal=esal+500 where esal<3000");
		st.addBatch("delete emp where eno=444");
		int[] rowCounts = st.executeBatch();
		for (int i = 0; i < rowCounts.length; i++) {
			System.out.println("Records updated....." + rowCounts[i]);
		}
		con.close();
	}
}
