package code.ds.impl;

import java.util.Arrays;

public class ArrayImpl {
	private long array[];
	private int maxSize;
	private int count = 0;

	public ArrayImpl(int maxSize) {
		this.maxSize = maxSize;
		array = new long[maxSize];
	}

	public long insert(long element) {
		if (count < maxSize) {
			array[count++] = element;
		}
		return element;
	}
	
	public long get(int index){
		if(index < 0 || index > maxSize-1)
			throw new IllegalArgumentException("Index can't be negative or higher than maxSize");
		return array[index];
	}

	public int delete(long element) {
		int matchIndex = -1;
		System.out.println("count :" + count);
		for (int i = 0; i < count; i++) {
			if (array[i] == element) {
				matchIndex = i;
				int j;
				for (j = matchIndex; j < count - 1; j++) {
					array[j] = array[j + 1];
				}
				array[j] = 0;
				count--;
				return matchIndex;
			}
		}
		return matchIndex;
	}

	public int size() {
		return count;
	}

	public long[] getArray() {
		return array;
	}

	public void setArray(long[] array) {
		this.array = array;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "ArrayImp [array=" + Arrays.toString(array) + ", maxSize=" + maxSize + ", count=" + count
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void setValue(int j, long temp) {
		if(j < -1 || j > count){
			throw new IllegalArgumentException("Index is not available");
		}
		array[j]=temp;
	}

}
