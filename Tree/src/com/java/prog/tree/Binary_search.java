package com.java.prog.tree;

public class Binary_search {
	public static boolean binary_search(Node root, int key){
		if(root == null){
			return false;
		}
		if(root.key == key){
			return true;
		}
		if (key < root.key)
			return binary_search(root.left, key);
		return binary_search(root.right, key);
			
	}
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		System.out.println(binary_search(root, 1));
	}
}
