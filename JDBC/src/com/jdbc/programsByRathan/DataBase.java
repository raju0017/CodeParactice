package com.jdbc.programsByRathan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBase {
	public static void main(String[] args) throws Exception {
		System.out.println("java developer jdbc is started ");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");
		Statement st = con.createStatement();
		Scanner s = new Scanner(System.in);
		System.out.println("**************table creation process***************");
		System.out.println("please enter table name");
		String tname = s.next();
		String str1 = "create table " + tname + "(eid number,ename varchar2(23),esal number)";
		st.executeUpdate(str1);
		System.out.println("table " + tname + " created successfully");
		
		System.out.println("**************insertion process***********");
		while (true) {
			System.out.println("please enter emp id");
			int eid = s.nextInt();
			System.out.println("please enter emp name");
			String ename = s.next();
			System.out.println("please enter emp sal");
			int esal = s.nextInt();
			String str2 = "insert into " + tname + " values(" + eid + ",'" + ename + "'," + esal + ")";
			st.executeUpdate(str2);
			System.out.println("do u want one more record(yes/no)");
			String option = s.next();
			if (option.equals("no")) {
				break;
			}
		}
		System.out.println("valus are inserted successfully");
		
		System.out.println("*********** retrive the data ****************");
		String str3 = "select * from " + tname;
		ResultSet rs = st.executeQuery(str3);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getInt(3));
		}
		System.out.println("*********** delete the data *******************");
		System.out.println("please enter employee salary which u want delete");
		int esal1 = s.nextInt();
		int rowcount = st.executeUpdate("delete " + tname + " where esal>=" + esal1 + " ");
		System.out.println("no of records effected:" + rowcount);
		String str5 = "select * from " + tname;
		ResultSet rs1 = st.executeQuery(str5);
		while (rs1.next()) {
			System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + "" + rs1.getInt(3));
		}
		System.out.println("*********** update the data *******************");
		String str6 = "update " + tname + " set esal=esal+500 where esal<=60000";
		int rowcount1 = st.executeUpdate(str6);
		System.out.println("no of records effected:" + rowcount1);
		String str7 = "select * from " + tname;
		ResultSet rs2 = st.executeQuery(str7);
		while (rs2.next()) {
			System.out.println(rs2.getInt(1) + " " + rs2.getString(2) + "" + rs2.getInt(3));
		}
		System.out.println("***************Drop the table*******************");
		String str4 = "drop table " + tname;
		st.executeUpdate(str4);
		String q = "purge table "+ tname;
		int rowsAffected = st.executeUpdate(q);
		System.out.println("tables purged ");
		System.out.println("table dropped " + tname + " successfully");
	}

}
