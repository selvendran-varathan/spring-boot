package code.ds.impl;

public class BinaryTree {
	TreeNode root=null;
	
	public TreeNode find(int key){
		TreeNode current=root;
		while(true){
			if(current == null)
				return null;
			if(current.data==key){
				return current;
			}else if(key<current.data){
				current=current.leftChild;
				if(current !=null){
					if(current.data ==key){
						return current;
					}
				}
			}else if(key>current.data){
				current=current.rightChild;
				if(current != null){
					if(current.data == key){
						return current;
					}
				}
			}
		}
	}
	
	public TreeNode insert(int value){
		TreeNode current=root;
		TreeNode parent;
		TreeNode node = new TreeNode(value);
		if(current == null){
			root=node;
		}else{
			while(true){
				parent=current;
				if(value<current.data){
					current=current.leftChild;
					if(current == null){
						parent.leftChild=node;
						return root;
					}
				}else{
					current=current.rightChild;
					if(current == null){
						parent.rightChild=node;
						return root;
					}
				}
			}
		}
		return root;
	}
	
	public void inOrderTraversal(TreeNode root){
		
		if(root != null){
			inOrderTraversal(root.leftChild);
			System.out.println(root.data);
			inOrderTraversal(root.rightChild);
		}
	}
	
	public void preOrderTraversal(TreeNode root){
		
		if(root != null){
			System.out.print(root.data+" ");
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
		}
	}
	
	public void postOrderTraversal(TreeNode root){
		
		if(root != null){
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.print(root.data+" ");
		}
	}
	
	public int treeHeight(TreeNode node){
		if(node == null){
			return 0;
		}
		return (1+Math.max(treeHeight(node.leftChild), treeHeight(node.rightChild)));
	}
	
	public boolean isSuperBalanced(TreeNode node){
		if(node == null){
			return true;
		}
		
		int leftHeight=treeHeight(node.leftChild);
		int rightHeight=treeHeight(node.rightChild);
		
		if(Math.abs(leftHeight-rightHeight) <=2 && isSuperBalanced(node.leftChild) && isSuperBalanced(node.rightChild))
			return true;
		return false;
	}

}
