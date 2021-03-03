package test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class Claint {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		Bank bproxy = (Bank)cap.getBean("b");
		/*
		int amount =bproxy.deposite("sbi123", 5000);
		System.out.println(amount);*/
		
		int amount1 = bproxy.findBal("sbi123");
		System.out.println(amount1);
		
		cap.close();
		
	}

}
