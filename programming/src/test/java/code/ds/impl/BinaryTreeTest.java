package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void insertAndFind() {
		BinaryTree bt = new BinaryTree();
		bt.insert(5);
		bt.insert(3);
		bt.insert(1);
		
		TreeNode node=bt.find(5);
		int nodeFoundValue=0;
		if(node !=null){
			nodeFoundValue=node.data;
		}
		assertEquals(5, nodeFoundValue);
		
		node=bt.find(3);
		nodeFoundValue=0;
		if(node !=null){
			nodeFoundValue=node.data;
		}
		assertEquals(3, nodeFoundValue);
		
		node=bt.find(1);
		nodeFoundValue=0;
		if(node !=null){
			nodeFoundValue=node.data;
		}
		assertEquals(1, nodeFoundValue);
	}
	@Test
	public void findFailForNonExistingItem(){
		BinaryTree bt = new BinaryTree();
		bt.insert(3);
		bt.insert(5);
		bt.insert(1);
		
		TreeNode node=bt.find(10);
		assertTrue(node ==null);
	}
	
	
	@Test
	public void inOrderTraversal(){
		BinaryTree bt = new BinaryTree();
		bt.insert(3);
		bt.insert(5);
		bt.insert(1);
		
		System.out.println("In Order Traversal");
		bt.inOrderTraversal(bt.root);
		System.out.println("Pre Order Traversal");
		bt.preOrderTraversal(bt.root);
		System.out.println("Post Order Traversal");
		bt.postOrderTraversal(bt.root);
	}
	
	@Test
	public void checkTreeHeight(){
		BinaryTree bt = new BinaryTree();
		bt.insert(10);
		bt.insert(72);
		bt.insert(15);
		bt.insert(8);
		bt.insert(22);
		bt.insert(3);
		bt.insert(17);
		bt.insert(16);
		bt.insert(18);
		bt.insert(19);
		bt.insert(20);
		bt.insert(21);
		System.out.println("checkTreeHeight");
		bt.inOrderTraversal(bt.root);
		assertEquals(bt.treeHeight(bt.root), 9);
	}
	

}
