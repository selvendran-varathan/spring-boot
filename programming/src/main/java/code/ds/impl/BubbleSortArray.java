package code.ds.impl;

import java.util.Arrays;

import org.apache.commons.math3.random.RandomDataImpl;

import code.ds.iface.SortInterface;
import code.general.utils.GenericUtil;

public class BubbleSortArray implements SortInterface {

	private ArrayImpl arrayImpl;
	public BubbleSortArray(int maxSize) {
		arrayImpl = new ArrayImpl(maxSize);
		
	}
	
	/* (non-Javadoc)
	 * @see code.ds.impl.SortInterface#fillArray()
	 */
	public void fillArray(){
		GenericUtil.fillArray(arrayImpl, 1, 100);
	}
	
	/* (non-Javadoc)
	 * @see code.ds.impl.SortInterface#sort()
	 */
	public void sort(){
		boolean swapped=true;
		int j=0;
		long temp;
		long array[] = arrayImpl.getArray();
		
		long startTime = System.currentTimeMillis();
		System.out.println();
		while(swapped){
			swapped=false;
			j++;
			for(int i=0;i<arrayImpl.size()-j;i++){
				if(array[i] > array[i+1]){
					temp=array[i];
					array[i] = array[i+1];
					array[i+1]=temp;
					swapped=true;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Sorted Array: "+ Arrays.toString(array));
		System.out.println("Time taken in millisecs: "+(endTime - startTime));
	}

	private void swap(long l, long m) {
		long temp;
		temp=l;
		l=m;
		m=temp;
	}

	public ArrayImpl getArrayImpl() {
		return arrayImpl;
	}

	public void setArrayImpl(ArrayImpl arrayImpl) {
		this.arrayImpl = arrayImpl;
	}

}
