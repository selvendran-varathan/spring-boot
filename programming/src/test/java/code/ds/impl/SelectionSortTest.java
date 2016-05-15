package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testSort() {
		SelectionSort ss = new SelectionSort(10000);
		ss.fillArray();
		ss.sort();
		System.out.println("SSArray: "+ss.getArrayImpl());
		assertTrue(ss.getArrayImpl().get(0) <= ss.getArrayImpl().get(1));
		assertTrue(ss.getArrayImpl().get(1) <= ss.getArrayImpl().get(2));
	}

}
