package interview.company.tangoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Employee1Test {

	@Test
	public void compareToTest() {

		Employee1 emp = new Employee1("222", "Raju", "male");
		Employee1 emp1 = new Employee1("222", "Raju", "male");
		Employee1 emp2 = new Employee1("444", "Siva", "male");
		
		int expected1 = 0;
		int actual1 = emp.getName().compareTo(emp1.getName());
		
		assertEquals(expected1, actual1);
		
		
		// or we can write
		int expected2 = -1;
		int actual2 = emp1.getName().compareTo(emp2.getName());
		
		assertEquals(expected2, actual2);
		
	
		
	}

}
