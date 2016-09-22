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
		try {
			sArr.push("100");
			assertEquals("100",sArr.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testPop() throws Exception {
		StackArray sArr = new StackArray(100);
		sArr.push("100");
		assertEquals(sArr.pop(),"100");
	}

	@Test
	public final void testPeek() throws Exception {
		StackArray sArr = new StackArray(100);
		sArr.push("100");
		assertTrue(sArr.peek()=="100");
	}
	

}
