package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleLinkedListTest {

	@Test
	public void reverseLinkedList() {
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(2));
		sl.append(new Node(3));
		sl.append(new Node(4));
		sl.print();
		sl.reverseLinkedList();
		sl.print();
		assertEquals(4, sl.head.data);
	}
	
	@Test
	public void removeDuplicates() {
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(4));
		sl.append(new Node(2));
		sl.append(new Node(3));
		sl.append(new Node(4));
		sl.append(new Node(3));
		sl.append(new Node(3));
		sl.append(new Node(1));
		sl.append(new Node(8));
		sl.append(new Node(3));
		sl.append(new Node(9));
		
		/*sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(1));*/
		
		sl.print();
		sl.removeDuplicates();
		sl.print();
		//assertEquals(4, sl.head.data);
	}
	
	@Test
	public void printNthToLastValid(){
		System.out.println("printNthToLastTest:");
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(4));
		sl.append(new Node(2));
		sl.append(new Node(3));
		sl.append(new Node(4));
		sl.append(new Node(3));
		sl.append(new Node(3));
		sl.append(new Node(1));
		sl.append(new Node(8));
		assertEquals(true, sl.printNthToLast(6));
	}
	
	@Test
	public void printNthToLastInvalid(){
		System.out.println("printNthToLastTest:");
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(4));
		assertEquals(false, sl.printNthToLast(6));
	}
	
	@Test
	public void getNthToLast(){
		System.out.println("getNthToLast:start");
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(4));
		sl.append(new Node(2));
		sl.append(new Node(3));
		sl.append(new Node(6));
		sl.append(new Node(7));
		sl.append(new Node(9));
		sl.append(new Node(11));
		sl.append(new Node(8));
		
		SingleLinkedList nthSll = sl.getNthToLast(4);
		System.out.println("getNthToLast output:");
		nthSll.print();
		assertEquals(3, nthSll.head.data);
		System.out.println("getNthToLast:end");
	}
	
	@Test
	public void deleteValidNode(){
		SingleLinkedList sl =new SingleLinkedList();
		Node tbdNode=new Node(4);
		sl.append(new Node(1));
		sl.append(tbdNode);
		sl.append(new Node(2));
		
		sl.print();
		Node deletedNode = sl.deleteNode(tbdNode);
		sl.print();
		assertEquals(deletedNode.data,tbdNode.data);
	}
	
	@Test
	public void deleteInvalidNode(){
		SingleLinkedList sl =new SingleLinkedList();
		Node tbdNode=new Node(4);
		sl.append(new Node(1));
		sl.append(new Node(2));
		
		sl.print();
		Node deletedNode = sl.deleteNode(tbdNode);
		sl.print();
		assertEquals(null,deletedNode);
	}
	
	@Test
	public void isValidCirculartList(){
		SingleLinkedList sl =new SingleLinkedList();
		Node oneNode=new Node(4);
		Node linkNode=new Node(1);
		
		sl.append(oneNode);
		sl.append(new Node(1));
		sl.append(new Node(4));
		sl.append(new Node(6));
		sl.append(linkNode);
		linkNode.next=oneNode;
		assertEquals(true, sl.isCircularList());
	}
	
	@Test
	public void isInvalidCirculartList(){
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(4));
		sl.append(new Node(6));
		assertEquals(false, sl.isCircularList());
	}

}
