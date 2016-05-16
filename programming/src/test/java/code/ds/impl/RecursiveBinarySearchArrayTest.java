package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveBinarySearchArrayTest {

	@Test
	public void testRecursiveBSPass() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		RecursiveBinarySearchArray rbs = new RecursiveBinarySearchArray(arr);
		assertEquals(2,rbs.recursiveBS(3,0, arr.length-1));
	}
	
	@Test
	public void testRecursiveBSFail() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		RecursiveBinarySearchArray rbs = new RecursiveBinarySearchArray(arr);
		assertEquals(-1,rbs.recursiveBS(11,0, arr.length-1));
	}

}
