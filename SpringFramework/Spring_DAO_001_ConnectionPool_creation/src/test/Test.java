package test;

import java.sql.Connection;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Test {
	public static void main(String[] args) {

		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("admin");
		bds.setMaxActive(15);
		bds.setMaxIdle(5);
		bds.setMaxWait(1000 * 5);

		Date d1 = new Date();
		for (int i = 0; i < 20; i++) {
			try {
				Connection con = bds.getConnection();
				System.out.println(con + " :" + i);
				con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Date d2 = new Date();
		System.out.println("Start time : "+d1);
		System.out.println("End time : "+d2);
	}

}
