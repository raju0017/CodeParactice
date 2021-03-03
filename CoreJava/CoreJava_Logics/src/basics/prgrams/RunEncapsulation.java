package basics.prgrams;



class EmpDetails {
	
	private int empid;
	private double sal;
	
	
	private EmpDetails(int empid, double sal) {
		super();
		this.empid = empid;
		this.sal = sal;
	}
	public void setId(int id)
	{
		this.empid=id;
	}
	public void setSalary(double sal)
	{
		this.sal=sal;
	}
	public static EmpDetails getInstance(int id,double sal)
	{
		return new EmpDetails(id, sal);
	}
	public int getEmpId()
	{
		return empid;
	}
	public double getEmpSalary()
	{
		return sal;
	}

}
public class RunEncapsulation
{
	public static void main(String[] args) {
		
		EmpDetails emp=EmpDetails.getInstance(1210, 25000);
		
		emp.setId(1012);
		emp.setSalary(20000);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpSalary());
		
	}
}

