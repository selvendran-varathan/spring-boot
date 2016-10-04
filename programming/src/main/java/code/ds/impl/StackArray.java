package code.ds.impl;

import code.ds.exception.ArrayException;

/*
 * Stack implementation using array
 * 
 */
public class StackArray {
	public int maxSize;
	public int top;
	public Object[] arr;
	
	/*
	 * Initialize maxSize, top, long array
	 */
	public StackArray(int maxSize){
		this.maxSize=maxSize;
		top=-1;
		arr = new Object[maxSize];
	}
	
	//TODO - push, pop, peek, isEmpty, isFull
	
	public void push(Object obj) throws ArrayException{
		if(!isFull()){
			arr[++top]=obj;
		}else{
			throw new ArrayException("Stack is full");
		}
		
	}

	public boolean isFull() {
		return top == (maxSize-1);
	}
	
	public Object pop() throws ArrayException{
		if(!isEmpty()){
			return arr[top--];
		}else{
			throw new ArrayException("Stack is empty");
		}
	}
	
	public Object peek() throws ArrayException{
		if(!isEmpty()){
			return arr[top];
		}else{
			throw new ArrayException("Stack is empty. No elements returned for peek");
		}
		
	}

	public boolean isEmpty() {
		return top==-1;
	}

	public int min() throws ArrayException {
		if(isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			ArrayWithMin awm = (ArrayWithMin) peek();
			return awm.getMin();
		}
	}
	
}
