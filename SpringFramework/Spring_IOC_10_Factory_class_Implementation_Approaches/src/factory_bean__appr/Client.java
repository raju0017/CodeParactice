 package factory_bean__appr;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factory_bean__appr.Car;

public class Client {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("factory_bean__appr/spring.xml");
		Car c =  (Car) apc.getBean("cf");
		c.drive();
	}
}
