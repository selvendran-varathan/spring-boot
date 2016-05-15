package code.general;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.general.basics.PrimeNumber;

public class PrimeNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void primeNumberPass() {
		PrimeNumber pn = new PrimeNumber();
		assertFalse(pn.primeNumberCheck(20));
	}
	
	@Test
	public void primeNumberFail() {
		PrimeNumber pn = new PrimeNumber();
		assertTrue(pn.primeNumberCheck(13));
	}
	
	@Test
	public void primeNumberZeroFail() {
		PrimeNumber pn = new PrimeNumber();
		assertTrue(pn.primeNumberCheck(0));
	}

}
