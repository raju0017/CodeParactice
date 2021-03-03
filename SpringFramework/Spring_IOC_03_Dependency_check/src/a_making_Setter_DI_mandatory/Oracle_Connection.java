package a_making_Setter_DI_mandatory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle_Connection {
	private String driver;
	private String url;
	private String username;
	private String password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void printConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);

	}

}
