package declarative_or_xml_aapr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public  class Test {
	private String driver,url,username, password;
	
	public Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	public void conInit() throws Exception {
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,username,password);
		System.out.println("connection opened");
	}
	
	
	public void cleanUp() throws Exception {
		con.close();
		System.out.println("connection closed");
	}
	
	public void save(int id,String name, String email, int marks ) throws Exception
	{
		PreparedStatement ps = con.prepareStatement("insert into student1 values (?,?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setInt(4, marks);
		ps.executeUpdate();
		System.out.println(" insertion Success");
	}
	

}
