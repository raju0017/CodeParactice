package basics.prgrams;
public class Adress {
	String city;
	String state;
	String country;
	public Adress(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public String toString()
	{
		return "Adress["+city+","+state+","+country+"]";
	}
	
	public void display()
	{
		System.out.println(city+"'"+state+","+country);
	}
	

}
