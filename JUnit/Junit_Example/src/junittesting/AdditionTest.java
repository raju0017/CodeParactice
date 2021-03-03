package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void additionTest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.addition(10, 20);
		assertEquals(30, result);
	}

}
