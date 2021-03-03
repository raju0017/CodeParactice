package framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import framework.Car;
import framework.CarFactory;

public class Client {

	public static void main(String[] args) throws Exception {

		ApplicationContext apc = new ClassPathXmlApplicationContext("framework/spring.xml");
	
		Car c = (Car)CarFactory.getCar();
		c.drive();
	}
}


