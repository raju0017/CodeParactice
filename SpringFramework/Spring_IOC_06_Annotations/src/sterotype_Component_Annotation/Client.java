package sterotype_Component_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sterotype_Component_Annotation.Car;

public class Client {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("sterotype_Component_Annotation/spring.xml");
		Car c = (Car) apc.getBean(Car.class);
		c.printData();
	}

}
