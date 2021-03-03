package static_variable_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static_variable_DI.Car;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("static_variable_DI/spring.xml");
		Car c = (Car) ap.getBean("c");
		c.printCar();
	}
}	