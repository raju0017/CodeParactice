package interview.company.tangoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTestCase {

	@Test
	public void equalsTest() {

		Employee emp2 = new Employee("101", "king", "male");
		Employee emp1 = new Employee("101", "king", "male");

		boolean actual = emp1.equals(emp2);

		assertEquals(true, actual);
	}

}
