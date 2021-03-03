 package static_Factory_method_appr;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static_Factory_method_appr.Car;

public class Client {
	
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("static_Factory_method_appr/spring.xml");
		Car c =  (Car) apc.getBean("cf");
		c.drive();
	}
}
