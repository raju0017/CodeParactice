package g_collection_Map_primitive_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import g_collection_Map_primitive_setter_DI.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("g_collection_Map_primitive_setter_DI/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}

}