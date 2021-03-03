package f_collection_secondery_setter_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import f_collection_secondery_setter_DI.Question;

public class Claint {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("f_collection_secondery_setter_DI/spring.xml");
		Question q = (Question) apc.getBean("q");
		q.displayInfo();
	}
}
