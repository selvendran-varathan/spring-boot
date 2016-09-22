package code.ds.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorial() {
		int num = 3;
		assertEquals(6,Factorial.factorial(num));
	}
	
	@Test
	public void testFactorialLarge() {
		int num = 7;
		assertEquals(5040,Factorial.factorial(num));
	}

}
