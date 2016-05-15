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
		SelectionSort ss = new SelectionSort(100);
		ss.fillArray();
		ss.sortType2();
		System.out.println("SSArray: "+ss.getArrayImpl());
		assertTrue(ss.getArrayImpl().get(0) <= ss.getArrayImpl().get(1));
		assertTrue(ss.getArrayImpl().get(1) <= ss.getArrayImpl().get(2));
	}

}
