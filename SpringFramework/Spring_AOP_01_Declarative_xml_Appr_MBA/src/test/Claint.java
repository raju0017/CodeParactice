package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class Claint {
	public static void main(String[] args) {

		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Bank bproxy = (Bank) cap.getBean("proxy");
		int amount = bproxy.deposite("sbi123", 5000);
		System.out.println(amount);
		
		cap.close();
	}

}
