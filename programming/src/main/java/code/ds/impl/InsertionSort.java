package code.ds.impl;

import code.ds.iface.SortInterface;
import code.general.utils.GenericUtil;

public class InsertionSort implements SortInterface {
	private ArrayImpl arrayImpl;
	
	public InsertionSort(int maxSize){
		arrayImpl = new ArrayImpl(maxSize);
	}
	
	public void fillArray() {
		GenericUtil.fillArray(arrayImpl, 1, 10000);
		
	}

	/*
	 * (non-Javadoc)
	 * @see code.ds.iface.SortInterface#sort()
	 * insertion sort - after each pass, of the processed index, left side of the array is sorted and
	 * right side of the array is unsorted
	 */
	public void sort() {
		int size=arrayImpl.size();
		int in;
		long sTime=System.currentTimeMillis();
		
		for(int out=0; out<size;out++){
			long temp=arrayImpl.get(out);
			in=out;
			
			while(in > 0 && arrayImpl.get(in-1)>temp){
				arrayImpl.setValue(in, arrayImpl.get(in-1));
				in--;
			}
			arrayImpl.setValue(in, temp);
		}
		System.out.println("Insertion Sorted Array:"+arrayImpl.toString());
		long eTime=System.currentTimeMillis();
		System.out.format("Time taken %s for Insertion sort with array size %d",(eTime-sTime),size);
	}

	public ArrayImpl getArrayImpl() {
		return arrayImpl;
	}

	public void setArrayImpl(ArrayImpl arrayImpl) {
		this.arrayImpl = arrayImpl;
	}

}
