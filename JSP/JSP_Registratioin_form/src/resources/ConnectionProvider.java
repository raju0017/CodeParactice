package resources;

import java.sql.Connection;
import java.sql.DriverManager;

import interfaces.Provider;

public class ConnectionProvider implements Provider {
	private static Connection con=null;  
	static{  
	try{  
	Class.forName(DRIVER);
	con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
	}catch(Exception e){}  
	}  
	  
	public static Connection getCon(){  
	    return con;  
	}  

}
