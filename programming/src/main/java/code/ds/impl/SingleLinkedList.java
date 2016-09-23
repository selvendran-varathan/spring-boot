package code.ds.impl;

/*
 * Reverse LinkedList(Single) Class
 */
public class SingleLinkedList {
	Node head;
	Node next;
	int data;
	
	public SingleLinkedList(){
		head=null;
		next=null;
	}
	
	//append node at the end
	public void append(Node node){
		if(head == null){
			head=node;
		}else{
			Node current=head;
			while(current.next !=null)
				current=current.next;
			current.next=node;
		}
	}
	
	public void reverseLinkedList(){
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current != null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public void print(){
		System.out.println("LinkedList values: ");
		Node current=head;
		while(current != null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	
}
