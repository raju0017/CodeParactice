package a_secondery_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a_secondery_setter_DI.Car;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("secondery_setter_DI/spring.xml");
		Car c = (Car)apc.getBean("c");
		c.display();
		
	}
}