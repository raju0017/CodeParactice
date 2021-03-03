package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		
		System.out.println("*****connection creation process******");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement statement=con.createStatement();
		
		System.out.println("*****table creation process******");
		
		String query1="create table emp11(eid number,ename varchar2(24),esal number)";
		int a=statement.executeUpdate(query1);
		System.out.println(a);
		System.out.println("table is create successfully");
		
		System.out.println("*****insertion process******");
		
		String query2="insert into emp11 values(111,'ratan',40000)";
		String query3="insert into emp11 values(222,'ratan',50000)";
		String query4="insert into emp11 values(333,'suneel',60000)";
		statement.executeUpdate(query2);
		statement.executeUpdate(query3);
		statement.executeUpdate(query4);
		System.out.println("values are inserted successfully");
		
		System.out.println("*****retriveing process******");
		
		String query5="select * from emp11";
		ResultSet set=statement.executeQuery(query5);
		while(set.next())
		{System.out.println(set.getInt(1)+"---"+set.getString(2)+"---"+set.getInt(3)); }
		System.out.println("values are printed successfully");
		
		System.out.println("******updation process******");
		
		String query6="update emp11 set esal=esal+500 where esal>40000";
		int count=statement.executeUpdate(query6);
		System.out.println("updated records----->"+count);
		System.out.println("table is updated successfully");
		Thread.sleep(30000);
		
		System.out.println("*************deletion process**********");
		
		String query7="drop table emp11";
		statement.executeUpdate(query7);
		System.out.println("table dropped successfully");
	}

}
