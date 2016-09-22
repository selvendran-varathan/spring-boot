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
	
	public void push(Object obj) throws Exception{
		if(top<maxSize){
			arr[++top]=obj;
		}else{
			throw new Exception("Stack is full");
		}
		
	}
	
	public Object pop() throws Exception{
		if(top > -1){
			return arr[top--];
		}else{
			throw new Exception("Stack is empty");
		}
	}
	
	public Object peek() throws Exception{
		if(top>-1){
			return arr[top];
		}else{
			throw new Exception("Stack is empty. No elements returned for peek");
		}
		
	}
	
}
