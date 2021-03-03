package factory_bean__appr;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean {
	private String carname;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	@Override
	public Object getObject() throws Exception {
		Car c = (Car) Class.forName(carname).newInstance();
		return c;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
