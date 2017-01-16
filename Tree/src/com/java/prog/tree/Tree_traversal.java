package com.java.prog.tree;
import java.util.Stack;

public class Tree_traversal {
	//Node root;
	public static void tree_inorder(Node node){
		if(node == null)
			return;
		
		Node root = node;
		
		Stack<Node> rootStack = new Stack<Node>();
		
		while(root != null){
			rootStack.push(root);
			root = root.left;
		}	
		
		while(!rootStack.isEmpty()){
			root = rootStack.pop();
			System.out.print(root.key + " ");
			if(root.right != null){
				root = root.right;
				while(root!= null){
					rootStack.push(root);
					root = root.left;
				}
			}
		}
	}
	
	public static void tree_preorder(Node node){
		if (node == null)
			return;
		Node root = node;
		
		Stack<Node> rootStack = new Stack<Node>();
		rootStack.push(root);
		
		while(!rootStack.isEmpty()){
			root = rootStack.pop();
			System.out.print(root.key + " ");
			
			if(root.right != null){
				rootStack.push(root.right);
			}
			if(root.left != null){
				rootStack.push(root.left);
			}
		}
	}
	
	public static void tree_postorder(Node node){
		if(node == null)
			return;
		Node root = node;
		
		Stack<Node> nodeStack = new Stack<Node>();
		do{
			while(root != null){
				if(root.right != null)
					nodeStack.push(root.right);
				nodeStack.push(root);
				root = root.left;
			}
			root = nodeStack.pop();
			
			if(root.right != null && !nodeStack.empty() && (nodeStack.peek() == root.right)){
				nodeStack.pop();
				nodeStack.push(root);
				root = root.right;
			}else{
				System.out.print(root.key + " ");
				root = null;
			}
		}while(!nodeStack.isEmpty());
	}


	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(16);
		root.left.left.right = new Node(6);
		root.right.left = new Node(7);
		root.right.left.right = new Node(8);
		root.right.left.right.left = new Node(9);

		System.out.print("Inorder traversal of binary tree is: ");
		tree_inorder(root);
		System.out.print("\n" + "Preorder traversal of binary tree is: ");
		tree_preorder(root);
		System.out.print("\n" + "Postorder traversal of binary tree is: ");
		tree_postorder(root);
		System.out.print("\n" + "BFS traversal of binary tree is: ");
		BFS_iterative.tree_BFS(root);
		int tree_size = Size_Height_ofA_Tree.size(root);
		System.out.print("\n" + "Size of the given tree is : " + tree_size);
		System.out.print("\n" + "height of the given tree is : " + Size_Height_ofA_Tree.height(root) );
		
		
	}
}
