package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogAfterService implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object ret, Method m, Object[] params, Object o) throws Throwable {
		
		Log l = LogFactory.getLog(Bank.class);
		l.info("deposite method "+ret );
	}
}
