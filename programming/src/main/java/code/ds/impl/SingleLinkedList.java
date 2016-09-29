package code.ds.impl;

/*
 * Reverse LinkedList(Single) Class
 */
public class SingleLinkedList {
	Node head;
	int data;
	
	public SingleLinkedList(){
		head=null;
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
	
	/*
	 * remove duplicates
	 * 1->2->3->4->2->1
	 * - process each node
	 * 	- compare with rest of the nodes
	 * 	- if match found, remove the node(swap the links)
	 *  
	 *  Test inputs:
	 *  1->
	 *  1->2->2
	 *  1->1->2
	 *  1->4->2->3->4->3
	 *  
	 *  current - used for looping each element
	 *  compareNode - looping each element comparing with current
	 *  previous - used for linking next element after deleting the duplicate
	 */
	public void removeDuplicates(){
		if(head == null)
			return;
		Node previous = head;
		Node current  = head;
		
		while(current != null){
			previous=current;
			Node compareNode = current.next;
			while(compareNode !=null){
				if(compareNode.data==current.data){
					//found duplicate - remove the node and continue the check
					previous.next=compareNode.next;
					compareNode=compareNode.next;
				}else{
					previous=compareNode;
					compareNode=compareNode.next;
				}
			}
			current=current.next;
		}
	}
	
	public void print(){
		System.out.println("LinkedList values: ");
		Node current=head;
		while(current != null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	/*
	 * find the nth element to last element of a singly linked list
	 * 
	 * Input:
	 *  head - Root Node
	 *  n - int
	 *  
	 * Output:
	 *  print nodes from nth to last 
	 *  
	 *  Key considerations:
	 *   empty node check
	 *   cover n > length
	 *   cover n < length
	 *   
	 *  Test inputs:
	 *  - 1->2->3->4->5->6->7 , n=3
	 *  - 1->2, n=5
	 * 
	 */
	public boolean printNthToLast(int n){
		Node current = head;
		int i=1;
		
		if(head == null){
			System.out.println("Empty LinkedList");
		}
		if(n <0){
			System.out.println("Invalid value of n:"+n);
			return false;
		}
		while(current !=null){
			if(i>=n){
				System.out.println(current.data+" ");
			}
			System.out.println("in loop ");
			current=current.next;
			i++;
		}
		if(i<n){
			System.out.println("Length of the LinkedList is "+(i-1)+", But N is :"+n);
			return false;
		}
		System.out.println("before return ");
		return true;
	}
	
	
	/*
	 * find the nth element to last element of a singly linked list
	 * 
	 * Input:
	 *  head - Root Node
	 *  n - int
	 *  
	 * Output:
	 *  print nodes from nth to last 
	 *  
	 *  Key considerations:
	 *   empty node check
	 *   cover n > length
	 *   cover n < length
	 *   
	 *  Test inputs:
	 *  - 1->2->3->4->5->6->7 , n=3
	 *  - 1->2, n=5
	 * 
	 */
	public SingleLinkedList getNthToLast(int n){
		Node current = head;
		SingleLinkedList sll = new SingleLinkedList();
		int i=1;
		
		if(head == null){
			System.out.println("Empty LinkedList");
			return sll;
		}
		if(n <0){
			System.out.println("Invalid value of n:"+n);
			return sll;
		}
		while(current !=null){
			if(i>=n){
				System.out.println("value of i: "+i+" data : "+current.data+" ");
				sll.append(new Node(current.data));
				System.out.println("append done");
			}
			current=current.next;
			i++;
			System.out.println("still looping");
		}
		if(i<n){
			System.out.println("Length of the LinkedList is "+(i-1)+", But N is :"+n);
		}
		return sll;
	}
	
	/*
	 * delete a node from the list
	 * find the node, swap the links
	 * 
	 * Test inputs:
	 * - head
	 * - middle
	 * - last
	 */
	 
	 public Node deleteNode(Node node){
		 Node current = head;
		 Node deletedNode=null;
		 Node previous=head;
		 
		 if(node == null){
			 System.out.println("deleteNode called with null input");
		 }else{
			 //head matches with input node
			 if(current.data==node.data){
				 node.next=head.next;
				 head=node;
				 deletedNode=node;
			 }
			 
			 while(current != null){
				 if(current.data==node.data){
					 previous.next=current.next;
					 deletedNode=node;
				 }
				 previous=current;
				 current=current.next;		 
			 }
		 }
		return deletedNode;
	 }
	 
	 /*
	  * API for circular list check
	  * 
	  * Test Inputs:
	  *  - regular linked list
	  *  - circular reference  
	  * 
	  */
	 public boolean isCircularList(){
		 Node current = head;
		 Node ffNode;
		 if(current == null){
			 return false;
		 }
		 ffNode=current.next;
		 if(ffNode == null){
			 return false;
		 }
		 while(current != null && ffNode.next!=null){
			 ffNode=ffNode.next.next;
			 if(ffNode == null){
				 return false;
			 }else if (ffNode == current){
				 System.out.println("Loop occured because of node-"+ffNode.data+" referring to node-"+current.data);
				 return true;
			 }
			 current=current.next;
		 }
		 return false;
	 }
	
}
