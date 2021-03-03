package l_seconderyType_Array_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import l_seconderyType_Array_DI.Car;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("l_seconderyType_Array_DI/spring.xml");
		Car c = (Car)apc.getBean("c");
		c.printcarData();
	}
}
