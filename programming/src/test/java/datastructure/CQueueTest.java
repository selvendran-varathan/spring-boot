package datastructure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.ds.exception.QueueEmptyException;
import code.ds.exception.QueueFullException;
import code.ds.impl.CQueue;

public class CQueueTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testIsEmpty() throws QueueFullException, QueueEmptyException {
		CQueue cqueue = new CQueue(10);
		cqueue.enqueue("1");
		cqueue.dequeue();
		assertTrue(cqueue.isEmpty());
	}

	@Test
	public final void testIsFull() throws QueueFullException {
		CQueue cqueue = new CQueue(2);
		cqueue.enqueue("1");
		cqueue.enqueue("2");
		assertTrue(cqueue.isFull());
	}

	@Test
	public final void testSize() throws QueueFullException {
		CQueue cQueue = new CQueue(2);
		cQueue.enqueue("1");
		assertEquals(cQueue.size(),1);
	}

	@Test
	public final void testEnqueue() throws QueueFullException {
		CQueue cQueue = new CQueue(2);
		cQueue.enqueue("1");
		assertEquals(cQueue.size(),1);
	}

	@Test
	public final void testDequeue() throws QueueFullException, QueueEmptyException {
		CQueue cQueue = new CQueue(2);
		cQueue.enqueue("1");
		cQueue.dequeue();
		assertEquals(cQueue.size(),0);
	}

}
