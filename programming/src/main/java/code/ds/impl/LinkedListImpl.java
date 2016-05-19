package code.ds.impl;

public class LinkedListImpl{
	Node head = null;
	
	public void add(Node node){
		Node pNode= head;
		if(head != null){
			while(pNode.next != null){
				pNode=pNode.next;
			}
			pNode.next=node;
		}else{
			head=node;
		}
	}
	
	public void addFirst(Node node){
		node.next=head;
		head=node;
	}
	
	public void addLast(Node node){
		Node lastNode=head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
		}
		lastNode.next=node;
	}
	
	public int removeFirst() throws LinkedListException{
		if(head == null){
			throw new LinkedListException("List is empty");
		}else{
			Node oldHead = head;
			head = head.next;
			return oldHead.data;
		}
	}
	
	public int find(int data){
		int index=0;
		Node tHead= head;
		while(tHead != null){
			if(tHead.data == data){
				System.out.println("Found data : "+tHead.data+" index: "+index);
				return index;
			}
			index++;
			tHead=tHead.next;
		}
		return -1;
	}
	
	public boolean isLoopPresent(){
		Node pNode=head;
		if(pNode == null){
			return false;
		}
		
		Node p1=head;
		Node p2=head.next;
		
		while(p2 != null){
			if(p1.data == p2.data){
				return true;
			}
			p1=p1.next;
			p2=p2.next;
		}
		return true;
		
	}
	
	public boolean setLoop(){
		Node pNode = head;
		if(pNode == null){
			return false;
		}
		while(pNode != null){
			pNode=pNode.next;
		}
		pNode=head;
		return true;
	}

}
