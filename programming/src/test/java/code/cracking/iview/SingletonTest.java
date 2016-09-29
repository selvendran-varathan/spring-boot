package code.cracking.iview;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		assertEquals(s1,s2);
	}

}
