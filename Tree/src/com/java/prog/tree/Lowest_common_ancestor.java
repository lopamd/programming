package com.java.prog.tree;

public class Lowest_common_ancestor {
	public static int LCA(Node root, int num1, int num2){
		if(root == null)
			return root.key;
		if(root.key < num1 && root.key < num2)
			return LCA(root.right, num1, num2);
		if(root.key > num1 && root.key > num2)
			return LCA(root.left, num1, num2);
		return root.key;
	}
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		System.out.println("The lowest common ancestor :" + LCA(root,3,4));
	}
}
