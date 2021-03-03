package method_replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewRateOfInterest implements MethodReplacer{

	@Override
	public Object reimplement(Object bank, Method rateOfInterest, Object[] arg2) throws Throwable {
		
		System.out.println("13%");
		return null;
	}

}

pending
