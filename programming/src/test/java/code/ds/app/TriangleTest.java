package code.ds.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testTriangleValue() {
		int n=10;
		Triangle tr = new Triangle(n);
		assertEquals(55,tr.triangleValue(n));
	}
	
	@Test
	(expected=IllegalArgumentException.class)
	public void testTraingleFail(){
		int n=0;
		Triangle tr = new Triangle(n);
		tr.triangleValue(n);
	}

}
