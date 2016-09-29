/**
 * 
 */
package code.general;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.general.basics.FibonacciSeries;

/**
 * @author snallath
 *
 */
public class FibonacciSeriesTest {
	//   n=0,1,2,3,4,5,6,
	//f(n)=0,1,1,2,3,5,8,

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void fibRegularPass() {
		assertEquals(8,FibonacciSeries.fibRegular(6));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fibRegularFail(){
		FibonacciSeries.fibRegular(-1);
	}
	
	@Test
	public void fibRecursivePass() {
		assertEquals(8,FibonacciSeries.fibRecursive(6));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fibRecursiveFail(){
		FibonacciSeries.fibRecursive(-1);
	}
}
	