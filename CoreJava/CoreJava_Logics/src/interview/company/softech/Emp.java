package interview.company.softech;

public class Emp {
	int eid,sal;
	String ename;
	public Emp()
	{
		
	}
	public Emp(int id, int sal, String name) {
		super();
		this.eid = id;
		this.sal = sal;
		this.ename = name;
	}
	
	public String toString(Emp e)
	{
		return "eid = "+eid + "ename = "+ename+ "sal = "+sal;
	}
	

}
