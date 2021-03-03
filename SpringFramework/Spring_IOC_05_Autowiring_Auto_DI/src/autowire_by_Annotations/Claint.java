package autowire_by_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire_by_Annotations.Car;

public class Claint {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("autowire_by_Annotations/spring.xml");
		Car c = (Car)apc.getBean("c");
		c.printdata();
	}

}
