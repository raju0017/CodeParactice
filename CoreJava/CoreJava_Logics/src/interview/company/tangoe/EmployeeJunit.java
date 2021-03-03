package interview.company.tangoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeJunit {

	@Test
	public void equalsTest() {

		Employee emp2 = new Employee("101", "king", "male");
		Employee emp1 = new Employee("101", "king", "male");

		boolean b = emp1.equals(emp2);
		
		System.out.println("equals method");

		assertEquals(true, b);
	}
	
	@Test
	public void hashCodeTest() {

		Employee  emp3 = new Employee("111", "nagaraj", "24");
		Employee  emp4 = new Employee("111", "nagaraj", "24");
		
		boolean b = emp3.hashCode() == emp4.hashCode();
		
		System.out.println("hashcode method");
		
		assertTrue(b);
	}

}
