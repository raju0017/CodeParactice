package com.king;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Client {

	 public static void main(String[] args) {	  
		 
		 Logger log = Logger.getLogger(Client.class.getName());
		  Layout lout = new SimpleLayout();
		  Appender a;
		  //Appender a = new ConsoleAppender(lout);
		  try
		  {
		  a = new FileAppender(lout,"my.txt", false);
	 
		  // 3rd parameter is true by default
		  // true = Appends the data into my.txt
		  // false = delete previous data and re-write
	 
		  log.addAppender(a);
		  }
		  catch(Exception e) {}	  
	 
		  log.fatal("This is the error message..");
		  System.out.println("Your logic executed successfully....");
	  }

}
