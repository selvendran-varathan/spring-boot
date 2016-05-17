package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testSort() {
		MergeSort ms = new MergeSort();
		ms.sort();
		int[] arr = ms.getArrayC();
		int i=3,j=4;
		assertTrue(arr[i] < arr[j]);
	}

}
