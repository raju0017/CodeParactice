package depends_on;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("depends_on/spring.xml");
		
	}

}
