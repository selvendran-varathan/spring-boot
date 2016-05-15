package code.ds.impl;

import code.ds.exception.QueueEmptyException;
import code.ds.exception.QueueFullException;
import code.ds.iface.CQueueInterface;

public class CQueue implements CQueueInterface {
	private int maxSize;
	private int nItems;
	private int front;
	private int rear;
	private Object[] Q;
	
	public CQueue(int maxSize){
		this.maxSize=maxSize;
		this.nItems=0;
		this.front=0;
		this.rear=0;
		Q = new Object[maxSize];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}

	public void enqueue(java.lang.Object obj) throws QueueFullException {
		if(!isFull()){
			Q[rear]=obj;
			rear = (rear+1)%maxSize;
			nItems++;
		}else{
			throw new QueueFullException("Queue is full");
		}
		
	}

	public Object dequeue() throws QueueEmptyException {
		if(!isEmpty()){
			nItems--;
			front=(front+1)%maxSize;
			return Q[front];
		}else{
			System.out.println("Error: Underflow");
			throw new QueueEmptyException("Queue is empty");
		}
		
	}
	
}
