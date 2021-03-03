package test;


import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Claint {
	public static void main(String[] args) {
		// creating target
		Bank b = new Bank();
		// creating advice
		LogBeforeService lbs = new LogBeforeService(); 
		// Adding target + advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);    
		// get generated proxy object
		Bank bproxy = (Bank)pfb.getObject();
		int amount =bproxy.deposite("sbi123", 5000);
		System.out.println(amount);
	}

}
