package code.ds.iface;

import code.ds.exception.QueueEmptyException;
import code.ds.exception.QueueFullException;

public interface CQueueInterface {
	
	public boolean isEmpty();
	public boolean isFull();
	public int size();
	public void enqueue(Object obj) throws QueueFullException;
	public Object dequeue() throws QueueEmptyException;
	

}
