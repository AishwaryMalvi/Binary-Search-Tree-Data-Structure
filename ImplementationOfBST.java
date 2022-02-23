package BinarySearchTree;

public class ImplementationOfBST {
	
	private treeNode root;
	private class treeNode{
		private int data;
		private treeNode left;
		private treeNode right;
		
		public treeNode(int data) {
			this.data = data;
		}
	}
	
	//insert
	public void insert (int value) {
		root = insert(root,value);
	}
	private treeNode insert(treeNode root, int value) {
		if(root == null) {
			root = new treeNode(value);
			return root;
		}
		if(value < root.data) {
			root.left = insert(root.left,value);
		}
		else {
			root.right = insert(root.right,value);
		}
		return root;
	}
	
	//display
	public void inorder() {
		inorder(root);
	}
	private void inorder(treeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	//search key
	
	public treeNode searchkey(int key) {
		return search(root,key);
	}
	
	public treeNode search(treeNode root,int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(key < root.data) {
			return search(root.left,key);
		}
		else {
			return search(root.right,key);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationOfBST bst = new ImplementationOfBST();
		bst.insert(5);
		bst.insert(10);
		bst.insert(12);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(8);
		bst.inorder();
		
		System.out.println();
		
		if(null != bst.searchkey(10)) {
			System.out.println("key Found!");
		}
		else {
			System.out.println("key not Found!");
		}
	}

}
