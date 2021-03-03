package interview.company.tangoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashTestCase {

	@Test
	public void hashTest() {

		Employee  emp1 = new Employee("111", "nagaraj", "24");
		Employee  emp2 = new Employee("111", "nagaraj", "24");
		
		boolean b = emp1.hashCode() == emp2.hashCode();
		assertEquals(true, b);
	}

}
