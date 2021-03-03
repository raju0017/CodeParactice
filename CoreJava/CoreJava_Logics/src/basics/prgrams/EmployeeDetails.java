package basics.prgrams;
import java.util.Scanner;

public class EmployeeDetails {
	private int id;
	private String name,Disignation;
	private float salary;
	public void getData() {
		System.out.println("--Enter Employee Data---");
		
		Scanner scn=new Scanner(System.in);
		System.out.println("ID? :");
		id=scn.nextInt();
		
		System.out.println("name :");
		name=scn.next();
		
		System.out.println("Disignation :");
		Disignation=scn.next();
		
		System.out.println("Salary :");
		salary=scn.nextFloat();
		
		System.out.println("---------------------\n");
	}
	public void showData(){
		System.out.println("ID         :"+id);
		System.out.println("name       :"+name);
		System.out.println("Disgnation :"+Disignation);
		System.out.println("salary     :"+salary);
	}
	
}
