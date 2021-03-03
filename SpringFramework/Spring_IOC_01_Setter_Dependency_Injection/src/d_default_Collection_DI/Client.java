package d_default_Collection_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import d_default_Collection_DI.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("d_default_Collection_DI/spring.xml");
		Test test =(Test)apc.getBean("t");
		test.printData();
	}

}
