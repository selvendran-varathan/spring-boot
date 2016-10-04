package code.ds.impl;

import code.ds.exception.ArrayException;

public class QueuewithTwoStacks {
	StackArray s1 = new StackArray(100);
	StackArray s2 = new StackArray(100);
	
	public void enqueue(int element) throws ArrayException{
		if(!s1.isFull()){
			s1.push(new Integer(element));
		}else{
			if(!s2.isFull()){
				while(!s2.isFull()){
					s2.push(s1.pop());
				}
			}
		}
			
	}
	
}
