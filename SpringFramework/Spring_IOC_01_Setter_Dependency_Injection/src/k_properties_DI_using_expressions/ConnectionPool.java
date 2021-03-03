package k_properties_DI_using_expressions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Set;

public class ConnectionPool {

	private Properties driver, url, username, password;

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public void setUrl(Properties url) {
		this.url = url;
	}

	public void setUsername(Properties username) {
		this.username = username;
	}

	public void setPassword(Properties password) {
		this.password = password;
	}

	/*public void createconnection()throws Exception
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username, password);
		System.out.println(con);
		
	}*/

	public void printData() {
		Set keys = driver.keySet();
		for (Object key : keys) {
			System.out.println(key + " : " + driver.getProperty(key.toString()));
		}
	}
}
