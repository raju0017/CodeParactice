package appClientModule.dataRead;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLQUERY 
{
	public static String qr = "select * from dept";

	public static void main(String[] args)
	{
		try 
		{
			Connection con = DBConnection.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(qr);
			
			
			while(rs.next())
			{
				int dno= rs.getInt(1);
				String dname =rs.getString(2);
				System.out.println(dno+"   "+dname);
			}
			
	} catch (Exception e)
		{
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
