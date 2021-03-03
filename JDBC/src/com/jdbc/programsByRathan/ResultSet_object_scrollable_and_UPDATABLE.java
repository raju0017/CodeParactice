package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSet_object_scrollable_and_UPDATABLE {
	public static void main(String[] args)throws Exception
	{ 
	System.out.println("java developer jdbc is started ");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl","hr","hr");
	
	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	System.out.println("*********** retrive the data ****************");
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter table name for Retrive");
	String tname = scn.next();
	String str3="select * from "+tname;
	ResultSet rs= st.executeQuery(str3);
		while(rs.next())
		{
			rs.updateInt(rs.getInt(1),1222);
			rs.updateRow();
		}	
	}

}
