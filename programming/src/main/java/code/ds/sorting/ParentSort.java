package code.ds.sorting;

import java.util.Arrays;

public abstract class ParentSort implements SortIface {
	int[] arr;
	int maxSize;
	
	public void setArr(int[] arr) {
		this.arr=arr;
	}

	public int[] getArr() {
		return arr;
	}

	public abstract void sort();
	
	public void print() {
		System.out.println("Output: "+Arrays.toString(arr));
	}
	
	public void swap(int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
