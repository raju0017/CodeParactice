package k_properties_DI_using_expressions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Claint {
	public static void main(String[] args) throws Exception {
		ApplicationContext apc = new ClassPathXmlApplicationContext("k_properties_DI_using_expressions/spring.xml");
		ConnectionPool cp =(ConnectionPool) apc.getBean("cp");
		cp.printData();
	}
}
