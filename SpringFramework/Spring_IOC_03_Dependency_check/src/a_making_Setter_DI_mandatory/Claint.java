package a_making_Setter_DI_mandatory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a_making_Setter_DI_mandatory.Oracle_Connection;

public class Claint {
	public static void main(String[] args) throws Exception {
		ApplicationContext apc = new ClassPathXmlApplicationContext("a_making_Setter_DI_mandatory/spring.xml");
		Oracle_Connection orcl =(Oracle_Connection) apc.getBean("oracle");
		orcl.printConnection();
	}
}
