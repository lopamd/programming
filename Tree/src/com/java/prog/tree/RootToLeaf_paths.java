package com.java.prog.tree;

public class RootToLeaf_paths {
	public static void printRoot_To_Leaf(Node root, int[] pathArr, int pathlength){
		if(root == null)
			return;
		pathArr[pathlength] = root.key;
		pathlength++;
		if(root.left == null && root.right == null){
			print_path(pathArr, pathlength);
		}else{
			printRoot_To_Leaf(root.left, pathArr, pathlength);
			printRoot_To_Leaf(root.right, pathArr, pathlength);
		}
		
		
	}
	
	public static void print_path(int[] arr, int length){
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(7);
		root.right.right = new Node(6);
		int[] pathArr = new int[100];
		printRoot_To_Leaf(root, pathArr, 0);
	}
}
