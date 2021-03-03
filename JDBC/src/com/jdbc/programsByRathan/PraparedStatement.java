package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PraparedStatement {
	public static void main(String[] args) throws Exception {

		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

		PreparedStatement statement = con.prepareStatement("insert into emp values(?,?,?,?)");
		Scanner scanner = new Scanner(System.in);
		String option;
		do {
			System.out.println("enter emp number:-");
			int eno = scanner.nextInt();
			System.out.println("enter emp name:-");
			String ename = scanner.next();
			System.out.println("enter emp sal:-");
			int esal = scanner.nextInt();
			System.out.println("enter address:-");
			String adress = scanner.next();
			statement.setInt(1, eno);
			statement.setString(2, ename);
			statement.setInt(3, esal);
			statement.setString(4, adress);
			statement.executeUpdate();

			System.out.println("record inserted sucessfully");
			System.out.println("do u weant one more record type yes/no");
			option = scanner.next();
		} while (option.equals("yes"));

		System.out.println("tahnk you");
	}
}
