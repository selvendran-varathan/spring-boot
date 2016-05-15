package code.general;

import static org.junit.Assert.*;

import org.junit.Test;

import code.general.methods.StringReplace;

public class StringReplaceTest {

	@Test
	public void strReplacePassTest() {
		StringReplace strReplace = new StringReplace();
		String replacedStr = strReplace.strReplace("Test", 'e', 'a');
		assertEquals(replacedStr,"Tast");
	}
	
	@Test
	public void strReplaceFailTest() {
		StringReplace strReplace = new StringReplace();
		String replacedStr = strReplace.strReplace("Test", 'b', 'a');
		assertEquals(replacedStr,"Test");
	}

}
