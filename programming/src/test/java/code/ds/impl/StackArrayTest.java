package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import code.ds.exception.ArrayException;

public class StackArrayTest {

	@Test
	public void pushValid() {
		StackArray sa = new StackArray(100);
		try {
			sa.push(new Integer(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected=ArrayException.class)
	public void pushInvalid() throws ArrayException {
		StackArray sa = new StackArray(1);
			sa.push(new Integer(10));
			sa.push(new Integer(10));
	}
	
	/*
	 * check execution time for approach one for storing min value in element itself
	 */
	@Test 
	public void checkMin1Test() throws ArrayException{
		
		StackArray sa = new StackArray(100000);
		int[] randomArr = new int[100000];
		Object obj = null;
		int randomValue;
		
		for(int i=0;i<100000;i++){
			randomValue=(int) ((Math.random()*10000)+1);
			randomArr[i]=randomValue;
		}
		
		long startTime=System.currentTimeMillis();
		for(int i=0; i < 100000;i++){
			obj = new ArrayWithMin(randomArr[i], Math.min(randomArr[i], sa.min()));
			sa.push(obj);
		}
		assertEquals(1, sa.min());
		long endTime=System.currentTimeMillis();
		System.out.println("Total time of execution for checkMin1Test: "+ (endTime-startTime));
		
		
		sa = new StackArray(100000);
		StackArray minStack = new StackArray(100000);
		ArrayWithMin arrayWithMin = null;
		minStack.push(new Integer(Math.min(0, sa.min())));
		startTime=System.currentTimeMillis();
		Integer intValue;
		for(int i=0; i < 100000;i++){
			intValue=new Integer(randomArr[i]);
			sa.push(intValue);
			try{
				if(intValue.intValue() < ((Integer)minStack.peek()).intValue()){
					minStack.push(arrayWithMin);
				}
			}catch(ArrayException ae){
				System.out.println("Continue with the exception : "+ae.getMessage());
			}
		}
		assertEquals(0,((Integer)minStack.peek()).intValue());
		endTime=System.currentTimeMillis();
		System.out.println("Total time of execution for checkMin2Test: "+ (endTime-startTime));
		System.out.println("minStack size: "+ minStack.top);
	}
	
	/*
	 * check execution time for approach one for storing min value in second stack
	 */
	//@Test 
	public void checkMin2Test() throws ArrayException{
		
		long startTime=System.currentTimeMillis();
		StackArray sa = new StackArray(100000);
		StackArray minStack = new StackArray(100000);
		ArrayWithMin arrayWithMin = null;
		minStack.push(new ArrayWithMin(0, Math.min(0, sa.min())));
		for(int i=0; i < 100000;i++){
			arrayWithMin = new ArrayWithMin(i, Math.min(i, sa.min()));
			sa.push(arrayWithMin);
			try{
				if(arrayWithMin.getValue() < ((ArrayWithMin)minStack.peek()).getValue()){
					minStack.push(arrayWithMin);
				}
			}catch(ArrayException ae){
				System.out.println("Continue with the exception : "+ae.getMessage());
			}
		}
		assertEquals(0, sa.min());
		long endTime=System.currentTimeMillis();
		System.out.println("Total time of execution for checkMin2Test: "+ (endTime-startTime));
	}

}
