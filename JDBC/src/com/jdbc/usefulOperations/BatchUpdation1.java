package com.jdbc.usefulOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdation1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl","scott", "tiger");
		Statement statement =connection.createStatement();
		
		//real time code
		statement.addBatch("create table Nag(id number not null, sname varchar2(30),std number)");
		statement.addBatch("insert into student values(101,'naga',10)");
		statement.addBatch("insert into student values(102,'siva',11)");
		statement.addBatch("insert into student values(103,'mohan',12)");
		statement.addBatch("update student set std=std+20 where std>10");
		statement.addBatch("drop table Nag  ");
		int[] arr = statement.executeBatch();
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		connection.close();
	}

}
