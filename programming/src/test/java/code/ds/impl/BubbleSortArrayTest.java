package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testFillArray() {
		BubbleSortArray bsArray = new BubbleSortArray(10);
		bsArray.fillArray();
		assertEquals(10,bsArray.getArrayImpl().size());
	}

	@Test
	public final void testBubbleSort() {
		BubbleSortArray bsArray = new BubbleSortArray(10000);
		bsArray.fillArray();
		bsArray.sort();
		System.out.println("BSArray: "+bsArray.getArrayImpl());
		assertTrue(bsArray.getArrayImpl().get(0) <= bsArray.getArrayImpl().get(1));
		assertTrue(bsArray.getArrayImpl().get(1) <= bsArray.getArrayImpl().get(2));
		assertTrue(bsArray.getArrayImpl().get(2) <= bsArray.getArrayImpl().get(3));
	}

}
