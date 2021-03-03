package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogINExceptionService;

public class Claint {
	public static void main(String[] args) {
		// creating target
		Bank b = new Bank();
		// creating advice
		LogINExceptionService lexc = new LogINExceptionService();
		// Adding target + advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lexc);
		// get generated proxy object
		Bank bproxy = (Bank)pfb.getObject();
		int amount =bproxy.deposite("sbi124", 5000);
		System.out.println(amount);
	}

}
