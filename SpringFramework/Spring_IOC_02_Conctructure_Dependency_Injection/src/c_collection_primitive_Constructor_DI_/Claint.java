package c_collection_primitive_Constructor_DI_;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import c_collection_primitive_Constructor_DI_.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("c_collection_primitive_Constructor_DI_/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}

}
