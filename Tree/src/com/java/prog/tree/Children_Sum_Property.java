package com.java.prog.tree;

public class Children_Sum_Property {
	public static boolean isSumProperty(Node root){
		if(root == null || (root.left == null && root.right == null) )
			return true;
	
		int sum = 0;
		if(root.left != null)
			sum += root.left.key;
		if(root.right != null)
			sum += root.right.key;
		if((sum == root.key) && isSumProperty(root.left) == true && isSumProperty(root.right) == true)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		if (isSumProperty(root) == true)
            System.out.println("The given tree satisfies children sum property");
        else
            System.out.println("The given tree does not satisfy children sum property");
	}
}
