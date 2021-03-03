package autowire_by_Annotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Claint {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("autowire_by_Annotations1/spring.xml");
		Car c = (Car)apc.getBean("c");
		c.printdata();
	}

}
