package c_collection_primitive_setter_DI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List<String> fruits;
	private Set<String> cricketers;
	private Map<String, String> countriesandCaptitals;

	public final List<String> getFruits() {
		return fruits;
	}

	public final void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public final Set<String> getCricketers() {
		return cricketers;
	}

	public final void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}

	public final Map<String, String> getCountriesandCaptitals() {
		return countriesandCaptitals;
	}

	public final void setCountriesandCaptitals(Map<String, String> countriesandCaptitals) {
		this.countriesandCaptitals = countriesandCaptitals;
	}

	public void display() {
		System.out.println("Fruits...........");
		for (Object obj : fruits) {
			System.out.println(obj);
		}
		System.out.println("Cricketers........");
		for (Object obj : cricketers) {
			System.out.println(obj);
		}

		System.out.println("Cuntry and Capital.......");
		Set keys = countriesandCaptitals.keySet();
		for (Object key : keys) {
			System.out.println("Cuntry=" + key + "  Capital =" + countriesandCaptitals.get(key));
		}

	}

}
