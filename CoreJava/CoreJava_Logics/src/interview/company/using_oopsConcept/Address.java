package interview.company.using_oopsConcept;

public class Address extends College {

	int no;
	String street;
	String city;
	String mandal;
	String district;
	String state;
	
	
	public Address(int no, String street, String city, String mandal, String district, String state) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
