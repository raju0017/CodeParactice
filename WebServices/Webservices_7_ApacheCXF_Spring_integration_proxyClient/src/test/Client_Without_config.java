package test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.king.service.Weather;
import com.king.service.WeatherServiceImpl;

public class Client_Without_config {

	public static void main(String[] args) {
		
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setAddress("http://localhost:9999/7_ApacheCXF_Spring_integration/services/WeatherServiceImplPort");
		factoryBean.setServiceClass(WeatherServiceImpl.class);
		WeatherServiceImpl service = (WeatherServiceImpl) factoryBean.create();
		
		Weather  w = service.getWeatherByCityID(101);
		
		System.out.println(w.getCityId());
		System.out.println(w.getCityname());
		System.out.println(w.getTemparature());
		
	}
}
 