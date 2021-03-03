package services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogINExceptionService implements ThrowsAdvice{
	
	public void afterThrowing(Exception ex)
	{
		Log l = LogFactory.getLog(Bank.class);
		l.info("incase of Exception in deposit "+ex.getMessage());
	}
	
	
	
}
