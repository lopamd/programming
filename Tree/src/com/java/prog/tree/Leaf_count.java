package com.java.prog.tree;

public class Leaf_count {
	public static int count_leaf(Node root){
		if(root == null)
			return 0;
		if(root.left == null & root.right == null)
			return 1;
		else
			return count_leaf(root.left) + count_leaf(root.right);
	}
public static void main(String[] args) {
	Node root = new Node(8);
	root.left = new Node(3);
	root.right = new Node(10);
	root.left.left = new Node(2);
	root.left.right = new Node(4);
	root.left.left.left = new Node(18);
	System.out.println(count_leaf(root));
}
}
