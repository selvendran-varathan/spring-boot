package code.ds.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProblemTest {

	@Test
	public void testIsDupCharPresentInStrPass() {
		String str = "Test";
		assertTrue(StringProblem.isDupCharPresentInStr(str));
	}
	
	@Test
	public void testIsDupCharPresentInStrFail() {
		String str = "Team";
		assertFalse(StringProblem.isDupCharPresentInStr(str));
	}
	
	@Test
	public void testReverseStringOddCountPass(){
		String str="MachineZone";
		assertEquals("enoZenihcaM",StringProblem.reverseString(str));
	}
	
	@Test
	public void testReverseStringEventCountPass(){
		String str="MachineZon";
		assertEquals("noZenihcaM",StringProblem.reverseString(str));
	}
	
	@Test
	(expected=IllegalArgumentException.class)
	public void testReverseStringFail(){
		String str=null;
		StringProblem.reverseString(str);
	}
	
	@Test
	public void reverseStrRecOddPass(){
		String str="ABCDEF";
		assertEquals("FEDCBA",StringProblem.reverseStrRec(str));
	}
	
	@Test
	public void reverseStrRecEvenPass(){
		String str="ABCDEFG";
		assertEquals("GFEDCBA",StringProblem.reverseStrRec(str));
	}
	
	@Test
	(expected=IllegalArgumentException.class)
	public void reverseStrRecEmptyPass(){
		String str="";
		assertEquals("GFEDCBA",StringProblem.reverseStrRec(str));
	}
	
	@Test
	public void testRemoveDuplicatesPass(){
		String str="aaabbb";
		String result=String.valueOf(StringProblem.removeDuplicates(str.toCharArray()));
		result=result.trim();
		System.out.println("Input: "+str+" Result: "+result+" length: "+result.length());
		assertTrue("ab".equals(result));
	}
	
	@Test
	public void testRemoveDuplicatesPass2(){
		String str="abcd";
		assertEquals("abcd", String.valueOf(StringProblem.removeDuplicates(str.toCharArray())));
	}

}
