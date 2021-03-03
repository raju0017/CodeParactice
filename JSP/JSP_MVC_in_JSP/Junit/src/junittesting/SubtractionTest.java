package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTest {

	@Test
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.subtraction(30, 20);
		assertEquals(10, result);
	}

}
