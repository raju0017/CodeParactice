package depends_on_by_p_and_c_namespaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import depends_on_by_p_and_c_namespaces.Car;

public class Client {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("depends_on_by_p_and_c_namespaces/spring.xml");
		Car c = (Car) apc.getBean("c");
		c.printdata();
	}
}
 