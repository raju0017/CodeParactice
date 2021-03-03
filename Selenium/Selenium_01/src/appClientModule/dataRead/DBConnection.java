package appClientModule.dataRead;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection
{
	public static Connection getConnection()
	{
        Properties props = new Properties();
        FileInputStream fis = null;
        Connection con = null;
        try {
            fis = new FileInputStream("C:/Users/nagaraju/Desktop/data.properties");
            props.load(fis);
 
            // load the Driver Class
            Class.forName(props.getProperty("DB_Class"));
 
            // create the connection now
            con = DriverManager.getConnection(props.getProperty("DB_Driver"),
                    props.getProperty("DB_UN"),
                    props.getProperty("DB_PWD"));
    		
        } 
        catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
       
    
    }


}
