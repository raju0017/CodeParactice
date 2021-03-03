package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.Bus;
import autowiring.Car;

public class Claint_autodetect {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("autowiring/spring_autodetect.xml");
		//Car c = (Car)apc.getBean("c");
		//c.printdata();
		Bus b = (Bus)apc.getBean("b");
		b.printData();
	}

}
