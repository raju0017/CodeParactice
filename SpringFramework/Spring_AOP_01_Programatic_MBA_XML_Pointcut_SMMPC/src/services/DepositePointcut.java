 package services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositePointcut extends StaticMethodMatcherPointcut {
	
	@Override
	public boolean matches(Method m, Class c) {
		
		String mathodname = m.getName();
		if(mathodname.equals("diposite"))	
			return true;
		
		else
			return false;
	}
	

}
