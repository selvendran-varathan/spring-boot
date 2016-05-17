package code.ds.impl;

import java.util.Arrays;

import code.ds.iface.SortInterface;

public class MergeSort implements SortInterface {
	private int[] arrayA;
	public int[] getArrayA() {
		return arrayA;
	}

	public int[] getArrayB() {
		return arrayB;
	}

	public int[] getArrayC() {
		return arrayC;
	}

	private int[] arrayB;
	private int[] arrayC;
	
	public MergeSort(){
		fillArray();
	}

	public void fillArray() {
		arrayA = new int[]{1,3,62,91,150};
		arrayB = new int[]{10,17,45,87,200};
	}

	public void sort() {
		int aCount=0, bCount=0, cCount=0;
		
		arrayC = new int[arrayA.length+arrayB.length];
		
		//process until one of the array is completely processed
		while(aCount<arrayA.length && bCount < arrayB.length){
			if(arrayA[aCount] < arrayB[bCount]){
				arrayC[cCount++]=arrayA[aCount++];
			}else{
				arrayC[cCount++]=arrayB[bCount++];
			}
			
		}
		
		while( aCount < arrayA.length){
			arrayC[cCount++]=arrayA[aCount++];
		}
		
		while( bCount < arrayB.length){
			arrayC[cCount++]=arrayB[bCount++];
		}
		System.out.println("Sorted Array: "+Arrays.toString(arrayC));
	}

}
