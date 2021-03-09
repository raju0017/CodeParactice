package setter_di;

public class Address {

	private int houseNo;
	private String area;
	private String town;
	private String city;
	private String state;
	private int pinCode;
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		
		return "Address : [Hno ="+this.houseNo+" area = "+this.area+" town = "+this.town+" city = "+this.city+" state = "+this.state
				+" pincode = "+this.pinCode+"]";
	}
	
}
