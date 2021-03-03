package j_properties_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import j_properties_setter_DI.ConnectionPool;

public class Claint {
	public static void main(String[] args) throws Exception {
		ApplicationContext apc = new ClassPathXmlApplicationContext("j_properties_setter_DI/spring.xml");
		ConnectionPool cp =(ConnectionPool) apc.getBean("cp");
		cp.printData();
	}
}
