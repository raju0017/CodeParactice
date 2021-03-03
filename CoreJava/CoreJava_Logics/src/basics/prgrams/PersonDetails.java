package basics.prgrams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDetails {

	public static void main(String[] args) {
		
		PreparedStatement pst=null;
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql//localhost/3306", "root", "root");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String Query="insert into sivareddy.person values(?,?,?)";
		try {
			pst=con.prepareStatement(Query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int res=0;
		try {
			pst.setString(1, "siva");
			pst.setInt(2, 25);
			pst.setString(3, "kurnool");
			res=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted values  "+res);

	}

}
