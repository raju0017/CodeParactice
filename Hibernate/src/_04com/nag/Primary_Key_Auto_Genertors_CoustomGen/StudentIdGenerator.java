package _04com.nag.Primary_Key_Auto_Genertors_CoustomGen;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor si, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		
		Serializable id = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			String prifix = "CRTI";
			con=si.connection();
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select RollNo.next from dual");
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		try {
			if(rs.next()){
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("resultset is null ");
			e.printStackTrace();
		}
		return (Serializable)rs;
	}
	
	public static String getPrimerykey(){
		
		Integer pk = null;
		StudentIdGenerator sig = new StudentIdGenerator();
		
		return "";
	}

	
}
