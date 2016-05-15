package code.ds.impl;

import java.util.Arrays;

public class ArrayImp {
	private long array[];
	@Override
	public String toString() {
		return "ArrayImp [array=" + Arrays.toString(array) + ", maxSize=" + maxSize + ", count=" + count
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	private int maxSize;
	private int count=0;
	
	public ArrayImp(int maxSize){
		this.maxSize=maxSize;
		array = new long[maxSize];
	}
	
	public long insert(long element){
		if(count < maxSize ){
			array[count++]=element;
		}
		System.out.println("count :"+count);
		return element;
	}
	
	public int delete(long element){
		int matchIndex=-1;
		System.out.println("count :"+count);
		for(int i=0;i<count;i++){
			if(array[i]==element){
				matchIndex=i;
				int j;
				for(j=matchIndex;j<count-1;j++){
					array[j]=array[j+1];
				}
				array[j]=0;
				count--;
				return matchIndex;
			}
		}
		return matchIndex;
	}

}
