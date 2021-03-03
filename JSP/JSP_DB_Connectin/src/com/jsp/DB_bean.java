package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DB_bean {
private String cmd;
ArrayList al = new ArrayList();

	public void setCmd(String cmd){
	this.cmd = cmd;
	}
	public int bm()
	{
		int m=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.17:1521:orcl","scott","tiger");
			Statement st = con.createStatement();
			if(st.execute(cmd))
			{
				ResultSet rs = st.getResultSet();
				while(rs.next())
				{
					al.add(rs.getString(1)+"  "+rs.getString(2));
				}
			return -10;
			}
			else
			{
				m= st.getUpdateCount();
			}
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return m;
		
	}
	public ArrayList getData()
	{
		return al;
	}

}
