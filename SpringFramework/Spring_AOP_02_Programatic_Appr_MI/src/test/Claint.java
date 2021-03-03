package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogAroundService;

public class Claint {
	public static void main(String[] args) {
		// creating target
		Bank b = new Bank();
		// creating advice
		LogAroundService las = new LogAroundService();
		// Adding target + advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(las);
		// get generated proxy object
		Bank bproxy = (Bank)pfb.getObject();
		int amount =bproxy.deposite("sbi123", 5000);
		System.out.println(amount);
	}

}
