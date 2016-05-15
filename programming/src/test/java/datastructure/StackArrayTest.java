package datastructure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.ds.impl.StackArray;

public class StackArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testPush() {
		StackArray sArr = new StackArray(100);
		sArr.push("100");
		assertFalse(sArr.isEmpty());
	}

	@Test
	public final void testPop() {
		StackArray sArr = new StackArray(100);
		sArr.push(100);
		assertEquals(sArr.pop(),100);
	}

	@Test
	public final void testPeek() {
		StackArray sArr = new StackArray(100);
		sArr.push("100");
		assertTrue(sArr.peek()=="100");
	}

	@Test
	public final void testIsEmpty() {
		StackArray sArr = new StackArray(100);
		assertTrue(sArr.isEmpty());
	}

	@Test
	public final void testIsFull() {
		StackArray sArr = new StackArray(2);
		sArr.push(2);
		sArr.push(3);
		assertTrue(sArr.isFull());
	}

}
