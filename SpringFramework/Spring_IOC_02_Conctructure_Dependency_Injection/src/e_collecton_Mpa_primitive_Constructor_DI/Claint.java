package e_collecton_Mpa_primitive_Constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import e_collecton_Mpa_primitive_Constructor_DI.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("e_collecton_Mpa_primitive_Constructor_DI/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}

}
