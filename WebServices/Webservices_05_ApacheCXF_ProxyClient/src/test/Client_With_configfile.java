package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.king.service.CalService;

public class Client_With_configfile {

	public static void main(String[] args) {
		
		// it should be take client side configuration file name as argument 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cxf.xml");
		
		// it should be taken as cxf.xml file <client> tag attribute value 	
		CalService ws = (CalService) ctx.getBean("myclient");
		
		
		int result = ws.add(12, 8);
		
		System.out.println(result);
	}
}
