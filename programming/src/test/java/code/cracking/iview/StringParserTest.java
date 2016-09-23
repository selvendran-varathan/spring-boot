package code.cracking.iview;

import static org.junit.Assert.*;

import org.junit.Test;

import code.cracking.iview.StringParser;

public class StringParserTest {

	@Test
	public void uniqueString() {
		assertTrue(StringParser.isUnique("Test"));
	}
	
	@Test
	public void uniqueString2() {
		assertTrue(StringParser.isUnique("abcd"));
	}

	@Test
	public void nonUniqueString() {
		assertFalse(StringParser.isUnique("tt"));
	}
}
