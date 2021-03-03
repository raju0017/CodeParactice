package com.jdbc.dynomic_inputs_from_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Create_dynomic_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.4:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Write table  Name");
		String tname = scn.nextLine();
		System.out.println(" table  Name =" + tname);
		int i = st.executeUpdate("create table " + tname + "(eid number, ename varchar2(50),sal number)");
		
		System.out.println("affected rows "+i);
		System.out.println("table Created successfully");
	}
}
