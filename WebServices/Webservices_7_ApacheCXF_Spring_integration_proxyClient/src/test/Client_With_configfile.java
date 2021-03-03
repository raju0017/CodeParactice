package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.king.service.Weather;
import com.king.service.WeatherServiceImpl;

public class Client_With_configfile {

	public static void main(String[] args) {

		// it should be take client side configuration file name as argument
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cxf.xml");

		// it should be taken as cxf.xml file <client> tag attribute value
		WeatherServiceImpl ws = (WeatherServiceImpl) ctx.getBean("myclient");

		Weather w = ws.getWeatherByCityID(101);

		System.out.println(w.getCityId());
		System.out.println(w.getCityname());
		System.out.println(w.getTemparature());
	}
}
