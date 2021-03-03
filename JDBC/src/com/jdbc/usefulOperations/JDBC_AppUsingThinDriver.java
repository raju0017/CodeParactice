package com.jdbc.usefulOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_AppUsingThinDriver 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException 
	{
		// loading the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//providing the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl", "scott", "tiger");
		Statement statement = connection.createStatement();
		
		//writing the query
		String q1 ="create table student(id number not null, sname varchar2(30),std number)";
		
		
		//Executing the query and data creation
		int x = statement.executeUpdate(q1);
		System.out.println("table created successfully.."+x);
		
		//inserting values into the table
		String q2 = "insert into student values(101,'naga',10)";
		String q3 = "insert into student values(102,'siva',11)";
		String q4 = "insert into student values(103,'mohan',12)";
		statement.executeUpdate(q2);
		statement.executeUpdate(q3);
		statement.executeUpdate(q4);
		System.out.println("values inserted successfullu");
		
		// data retrieving from the table
		String q5 = "select * from student";
		ResultSet set =statement.executeQuery(q5);
		while(set.next())
		{
			System.out.println(set.getInt(1)+"......"+set.getString("Sname")+"......"+set.getInt(3));
		}
		System.out.println("data printing is completed");
		
		
		// update the data
		String q6 = "update student set std=std+10 where std>10";
		int y = statement.executeUpdate(q6);
		System.out.println("number of values updated="+y);
		
		Thread.sleep(10000);
		
		//drop the data
		String q7 ="drop table student";
		ResultSet z = statement.executeQuery(q7);
		System.out.println("tables droped successfully ="+z);
		
		//close the connection
		connection.close();
		
	}

}
