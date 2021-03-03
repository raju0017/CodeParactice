package static_factory_method_ret_another;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("static_factory_method_ret_another/spring.xml");
		Printable p = (Printable) apc.getBean("p");
		p.print();
	}
}
