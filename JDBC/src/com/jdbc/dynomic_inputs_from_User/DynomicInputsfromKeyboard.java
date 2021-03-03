package com.jdbc.dynomic_inputs_from_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynomicInputsfromKeyboard 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl", "scott", "tiger");
		Statement statement = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter table name");
		String tname = scanner.next();
		String q1 = "create table "+tname+"(id number, cname varchar2(30), spentrs number)";
		statement.executeUpdate(q1);
		System.out.println("table created successfully");
		
		while(true)
		{
			System.out.println("enter id ");
			int cid = scanner.nextInt();
			System.out.println("enter cust name");
			String cname = scanner.next();
			System.out.println("enter spent rs");
			float sprs = scanner.nextFloat();
			
			String q2 = "insert into "+tname+" values("+cid+", '"+cname+"', "+sprs+")";
			System.out.println(q2);
			statement.executeUpdate(q2);
			System.out.println("values inserted successfully");
			System.out.println("do you want to insert one more record(yes/no");
			String option = scanner.next();
			if(option.equals("no"))
			{
				break;
			}
			
		}
		Thread.sleep(15000);
		
		System.out.println("enter table name to drop");
		String droptable = scanner.next();
		String q3 = "drop table "+droptable;
		statement.executeUpdate(q3);
		
		System.out.println("table "+droptable+" droped successfully");
		System.out.println("all oprations executed successfully");
		
		
		
	}

}
