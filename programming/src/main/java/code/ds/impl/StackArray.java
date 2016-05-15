package code.ds.impl;

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
	
	public void push(Object obj){
		arr[++top]=obj;
	}
	
	public Object pop(){
		return arr[top--];
	}
	
	public Object peek(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}
	

}
