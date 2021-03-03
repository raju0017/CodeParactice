package com.jdbc.staements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExample 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl", "scott", "tiger");
		Statement statement = connection.createStatement();
		String q1 = "create table emb(id number, ename varchar2(30), esal number)";
		statement.executeUpdate(q1);
		
		// insert the data by using PreparedStatement 
		PreparedStatement preparedStatement = connection.prepareStatement("insert into emb values(?, ?, ?)");
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter emb id");
			int eid = scanner.nextInt();
			
			System.out.println("enter emb name");
			String ename = scanner.next();
			
			System.out.println("Enter emb sal");
			float esal = scanner.nextFloat();
			
			preparedStatement.setInt(1, eid);
			preparedStatement.setString(2, ename);
			preparedStatement.setFloat(3, esal);
			int i = preparedStatement.executeUpdate();
			
			System.out.println(i);
			
			System.out.println("do you want one more record(yes/no");
			String option = scanner.next();
			if(option.equals("no"))
			{
				break;
			}
			
		}
		
		System.out.println("Records inserted successfully");
		
		Thread.sleep(15000);
		
		// update Records
		PreparedStatement preparedStatement2 = connection.prepareStatement("update emb set ename=? where ename=?");
		
		preparedStatement2.setString(1, "ratan");
		preparedStatement2.setString(2, "king");
		preparedStatement2.executeUpdate();
		
		preparedStatement2.setString(1, "raju");
		preparedStatement2.setString(2, "cobra");
		int x = preparedStatement2.executeUpdate();
		System.out.println(x);
		
		System.out.println("entr table name you want to drop");
		
		
		
		
		
		connection.close();
	}

}
