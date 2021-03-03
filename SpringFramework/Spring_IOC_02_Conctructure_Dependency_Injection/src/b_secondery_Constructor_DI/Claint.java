package b_secondery_Constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import b_secondery_Constructor_DI.Employee;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("b_secondery_Constructor_DI/spring.xml");
		Employee e = (Employee) apc.getBean("e");
		e.show();
	}

}
