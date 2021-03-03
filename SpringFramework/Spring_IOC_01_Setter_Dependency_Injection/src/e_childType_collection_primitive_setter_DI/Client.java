package e_childType_collection_primitive_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import e_childType_collection_primitive_setter_DI.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("e_childType_collection_primitive_setter_DI/spring.xml");
		Test test = (Test) apc.getBean("t");
		test.printData();
	}
}
