package code.ds.impl;

import code.ds.iface.SortInterface;
import code.general.utils.GenericUtil;

public class SelectionSort implements SortInterface {
	private ArrayImpl arrayImpl;
	
	
	public SelectionSort(int maxSize) {
		this.arrayImpl = new ArrayImpl(maxSize);
	}

	public void fillArray() {
		GenericUtil.fillArray(arrayImpl, 1, 10000);
		
	}

	/*
	 * (non-Javadoc)
	 * @see code.ds.iface.SortInterface#sort()
	 * Selection sort - find the min and then swap, better than Bubble sort.
	 * Reduced swapping operations. O(N2) 
	 */
	public void sortType2() {
		int j=0;
		int size = arrayImpl.size();
		int minIndex;
		long startTime = System.currentTimeMillis();
		while(j<size){
			minIndex=j;
			for(int in=j; in < size; in++){
				if(arrayImpl.get(in) < arrayImpl.get(minIndex)){
					minIndex=in;
				}
			}
			//if min is changed
			if(minIndex != j){
				long temp=arrayImpl.get(minIndex);
				arrayImpl.setValue(minIndex,arrayImpl.get(j));
				arrayImpl.setValue(j,temp);
			}
			j++;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken(millisec): "+(endTime - startTime));
		
	}
	
	public void sort(){
		int out,in,min;
		int size = arrayImpl.size();
		
		long startTime=System.currentTimeMillis();
		for(out=0; out <size-1;out++){
			min=out;
			for(in=out+1;in<size;in++){
				if(arrayImpl.get(in)<arrayImpl.get(min)){
					min=in;
				}
			}
			if(min!=out){
				long temp=arrayImpl.get(min);
				//System.out.println("Before swapping: "+arrayImpl.toString());
				arrayImpl.setValue(min,arrayImpl.get(out));
				arrayImpl.setValue(out,temp);
				//System.out.println("MinIndex: "+min+" j:"+out);
				//System.out.println("After swapping: "+arrayImpl.toString());
			}
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken(millisec): "+(endTime - startTime));
	}
	
	public ArrayImpl getArrayImpl() {
		return arrayImpl;
	}

	public void setArrayImpl(ArrayImpl arrayImpl) {
		this.arrayImpl = arrayImpl;
	}

}
