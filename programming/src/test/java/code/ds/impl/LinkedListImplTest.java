package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListImplTest {

	@Test
	public void testAdd() {
		Node node = new Node(10);
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node);
		assertTrue(llImpl.find(node.data) != -1);
	}

	@Test
	public void testAddFirst() {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		llImpl.addFirst(node2);
		assertTrue(llImpl.find(node2.data)==0);
	}

	@Test
	public void testAddLast() {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		llImpl.addFirst(node2);
		llImpl.addLast(node3);
		assertTrue(llImpl.find(node3.data)==2);
	}

	@Test
	public void testRemoveFirst() throws LinkedListException {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		llImpl.addFirst(node2);
		llImpl.removeFirst();
		assertTrue(llImpl.find(node2.data)==-1);
	}

	@Test
	public void testFind() {
		Node node1 = new Node(10);
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		assertTrue(llImpl.find(node1.data)==0);
	}
	
	@Test
	public void testIsLoopPresentPass(){
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		llImpl.add(node2);
		llImpl.add(node3);
		llImpl.setLoop();
		assertTrue(llImpl.isLoopPresent());
		
	}
	
	@Test
	public void testIsLoopPresentFail(){
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		
		LinkedListImpl llImpl = new LinkedListImpl();
		llImpl.add(node1);
		llImpl.add(node2);
		llImpl.add(node3);
		assertTrue(llImpl.isLoopPresent());
		
	}

}
