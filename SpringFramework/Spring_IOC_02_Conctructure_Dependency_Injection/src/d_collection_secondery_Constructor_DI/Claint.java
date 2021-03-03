package d_collection_secondery_Constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import d_collection_secondery_Constructor_DI.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("d_collection_secondery_Constructor_DI/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}

}
