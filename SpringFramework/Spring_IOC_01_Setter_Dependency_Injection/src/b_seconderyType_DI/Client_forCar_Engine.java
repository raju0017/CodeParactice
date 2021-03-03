package b_seconderyType_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import b_seconderyType_DI.Car;

public class Client_forCar_Engine {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("b_seconderyType_DI/car.engine.xml");
		Car c = (Car) apc.getBean("c");
		c.printData();
	}
}