package test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.king.service.CalService;

public class Client_Without_config {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		
		factoryBean.setAddress("http://localhost:9999/6_ApacheCXF/services//CalServicePort");
		
		factoryBean.setServiceClass(CalService.class);
		CalService service = (CalService) factoryBean.create();
		
		int result = service.add(12, 5);
		System.out.println(result);
		
	}
}
