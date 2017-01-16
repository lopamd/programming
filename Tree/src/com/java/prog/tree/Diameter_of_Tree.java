package com.java.prog.tree;
/*There are three cases to consider when trying to find the longest path between two nodes in a binary tree (diameter):

The longest path passes through the root,
The longest path is entirely contained in the left sub-tree,
The longest path is entirely contained in the right sub-tree.
The longest path through the root is simply the sum of the heights of the left and right sub-trees + 1 
(for the root node), and the other two can be found recursively:
 */
public class Diameter_of_Tree {
	public static int diameter_tree(Node root){
		if(root == null)
			return 0;
		int root_diameter = height(root.left) + height(root.right) + 1;
		int leftDiameter = diameter_tree(root.left);
		int rightDiameter = diameter_tree(root.right);
		return Math.max(root_diameter,Math.max(leftDiameter,rightDiameter));
	}
	public static int height(Node root){
		if(root == null)
			return 0;
		return(Math.max(height(root.left),height(root.right)) + 1);
	}
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left.left = new Node(18);
		System.out.println(diameter_tree(root));
	}
}
