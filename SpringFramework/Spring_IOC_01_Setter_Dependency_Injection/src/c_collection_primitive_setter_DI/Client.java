package c_collection_primitive_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import c_collection_primitive_setter_DI.Test;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("c_collection_primitive_setter_DI/spring.xml");
		Test test = (Test) apc.getBean("t");
		test.display();
	}

}
