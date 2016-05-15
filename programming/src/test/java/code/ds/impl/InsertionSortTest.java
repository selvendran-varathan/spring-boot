package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public final void testSort() {
		InsertionSort is = new InsertionSort(10000);
		is.fillArray();
		is.sort();
		assertTrue(is.getArrayImpl().get(0)<=is.getArrayImpl().get(1));
		assertTrue(is.getArrayImpl().get(6)<=is.getArrayImpl().get(7));
		assertTrue(is.getArrayImpl().get(5)<=is.getArrayImpl().get(8));
	}

}
