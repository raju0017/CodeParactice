package b_making_Setter_DI_manadatory_by_Required_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import b_making_Setter_DI_manadatory_by_Required_Annotation.MySql_Connection;

public class Claint {
	public static void main(String[] args) throws Exception {
		ApplicationContext apc = new ClassPathXmlApplicationContext("b_making_Setter_DI_manadatory_by_Required_Annotation/spring.xml");
		MySql_Connection mysql =(MySql_Connection) apc.getBean("mysql");
		mysql.printConnection();
	}
}
