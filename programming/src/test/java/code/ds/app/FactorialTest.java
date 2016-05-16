package code.ds.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorial() {
		int num = 3;
		Factorial fact = new Factorial(num);
		assertEquals(6,fact.factorial(num));
	}
	
	@Test
	public void testFactorialLarge() {
		int num = 7;
		Factorial fact = new Factorial(num);
		assertEquals(5040,fact.factorial(num));
	}

}
