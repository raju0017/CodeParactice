package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogAfterService;

public class Claint {
	public static void main(String[] args) {
		
		// creating target
		Bank b = new Bank();
		// creating advice
		LogAfterService las = new LogAfterService();
		// Adding target + advice to proxy
		ProxyFactoryBean pbf = new ProxyFactoryBean();
		pbf.setTarget(b);
		pbf.addAdvice(las);
		System.err.println("success");
		// get generated proxy object
		Bank bproxy = (Bank) pbf.getObject();
		int amount = bproxy.deposite("sbi123", 5000);
		System.out.println(amount);
	}

}
