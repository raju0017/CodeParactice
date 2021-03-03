package com.jdbc.dynomic_inputs_from_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Search_and_Create_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Write table  Name");
		String tbname = scn.nextLine();
		ResultSet rs = st.executeQuery("select * from tab");
		int count = 0;
		while (rs.next()) {
			if (rs.getString(1).equalsIgnoreCase(tbname)) {
				count = 1;
				break;
			}
		}
		if (count == 1) {
			System.out.println("table already exist");
		} else {
			String q = "create table " + tbname
					+ "(sid number primary key,sname varchar2(50), semail varchar2(50), address varchar2(50))";
			int effectedRows = st.executeUpdate(q);
			System.out.println("effectedRows: "+effectedRows);
			System.out.println("table created successfully");
		}
	}
}
