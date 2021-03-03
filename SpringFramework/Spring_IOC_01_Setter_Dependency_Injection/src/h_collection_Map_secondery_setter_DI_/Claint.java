package h_collection_Map_secondery_setter_DI_;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import h_collection_Map_secondery_setter_DI_.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("h_collection_Map_secondery_setter_DI_/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}

}
