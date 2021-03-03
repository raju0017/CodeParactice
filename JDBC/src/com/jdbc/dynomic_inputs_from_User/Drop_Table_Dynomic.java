package com.jdbc.dynomic_inputs_from_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Drop_Table_Dynomic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.7:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Write table  Name to drop");
		String tname = scn.nextLine();
		int i = st.executeUpdate("drop table " + tname);
		System.out.println("no.of rows effected :"+i);
		System.out.println(" table  " + tname + "  droped ");
		st.executeUpdate("purge table " + tname);
		System.out.println(" table  " + tname + "  purged ");
	}
}
