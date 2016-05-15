package datastructure;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Before;
import org.junit.Test;

import code.ds.impl.BinarySearchSortedArray;

public class BinarySearchSortedArrayTest {

	BinarySearchSortedArray binArray;
	
	@Before
	public void init(){
		binArray = new BinarySearchSortedArray();
		binArray.assignArray();
		
	}
	
	@Test
	public void isKeyPresentTest() {
		System.out.println("isKeyPresentTest [array]:"+ToStringBuilder.reflectionToString(binArray.studentArr));
		System.out.println("isKeyPresentTest [array]:"+Arrays.toString(binArray.studentArr));
		assertTrue(binArray.isKeyPresent(23));
	}
	
	@Test
	public void isKeyPresent2Test() {
		System.out.println("isKeyPresent2Test [array]:"+ToStringBuilder.reflectionToString(binArray.studentArr));
		System.out.println("isKeyPresent2Test [array]:"+Arrays.toString(binArray.studentArr));
		assertTrue(binArray.isKeyPresent2(22));
	}

}
