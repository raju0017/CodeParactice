package static_factory_method_ret_own;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static_factory_method_ret_own.Test;

public class Client {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("static_factory_method_ret_own/spring.xml");
		Test t = (Test) apc.getBean("t");
		Calendar c = (Calendar) apc.getBean("c");
		System.out.println(c.getCalendarType());
		System.out.println(t);
	}
}
