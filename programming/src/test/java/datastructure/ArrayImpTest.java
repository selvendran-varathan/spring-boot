package datastructure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import code.ds.impl.ArrayImp;

public class ArrayImpTest {
	ArrayImp aimp;
	
	@Before
	public void init(){
		aimp = new ArrayImp(100);
	}

	@Test
	public void insertPass() {
		long value = aimp.insert(45);
		assertEquals(45,value);
		System.out.println("aimp: "+aimp.toString());
	}
	
	@Test
	public void deletePass(){
		aimp.insert(45);
		System.out.println("aimp: "+aimp.toString());
		long index=aimp.delete(45);
		assertEquals(0,index);
	}
	
	@Test
	public void deleteFail(){
		long index=aimp.delete(42);
		assertEquals(-1,index);
	}

}
