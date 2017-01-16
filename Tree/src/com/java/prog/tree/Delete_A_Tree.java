package com.java.prog.tree;
import java.util.Stack;

public class Delete_A_Tree {
	public static Node delete(Node root){
		if(root == null)
			return root;
		if ((root.left == null) && (root.right == null)) {
            // leaf node
            root = null;
            return root;
        }
		Stack<Node> deleteStack = new Stack<Node>();
		do{
			while(root != null){
				if(root.right != null)
					deleteStack.push(root.right);
				deleteStack.push(root);
				root = root.left;
			}
			root = deleteStack.pop();
			if(root.right != null && !deleteStack.isEmpty() && (root.right == deleteStack.peek())){
				deleteStack.pop();
				deleteStack.push(root);
				root = root.right;
			}else{
				/* then delete the node */
		        System.out.println("The deleted node is " + root.key);
				root = null;
			}		
		}while(!deleteStack.isEmpty());
		return root;
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
		
		System.out.println("Deleting a tree ");
		Node resultRoot = delete(root);
		if (resultRoot == null)
			System.out.println("Tree is deleted");
		
	}
}
