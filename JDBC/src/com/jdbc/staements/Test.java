package com.jdbc.staements;

import java.sql.*;
import java.sql.DriverManager;

// this program in not works because

/*
java.lang.classnotfoundexception sun.jdbc.odbc.jdbcodbcdriver exception comes in Java 8 because it has removed the JDBC ODBC bridge driver class "sun.jdbc.odbc.jdbcodbcdriver" from JDK and JRE. This class is required to connect any database using Object database connectivity driver e.g. Microsoft Access, but unfortunately you cannot use it from JDK 8 onward. In order to solve this error, just use Jackcess library or a commercial driver like HXTT.


Read more: http://javarevisited.blogspot.com/2015/07/how-to-solve-javalangclassnotfoundexception-sun.jdbc.odbc.jdbcodbcdriver.html#ixzz4CIBAzYan
1- hsqldb.jar

2- jackcess 2.0.4.jar

3- commons-lang-2.6.jar

4- commons-logging-1.1.1.jar

5- ucanaccess-2.0.8.jar

add these libraries to your java project and start with following lines.

Connection conn=DriverManager.getConnection("jdbc:ucanaccess://<Path to your database i.e. MS Access DB>");
Statement s = conn.createStatement();*/


public class Test 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException
	{
		// load the driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("driver loaded");
		
		// provide the connection between java and DB
		Connection con = DriverManager.getConnection("jdbc:odbc:raju", "scott", "tiger");
		
		System.out.println(":Connection created");
		System.out.println(con.getClass().getName());
		Test t = new Test();
		System.out.println(t.getClass().getName());
		Thread.sleep(5000);
		
		// write the Query using Statement object
		String q1 = "create table studunt(sId number, Sname varchar2(30), Sclass number)";
		Statement st = con.createStatement();
		
		//Execute the query 
		int x =st.executeUpdate(q1);
		
		System.out.println(x);
		
		//close the connection
		con.close();
		
	}

}
