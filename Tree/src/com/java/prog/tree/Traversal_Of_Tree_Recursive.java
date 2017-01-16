package com.java.prog.tree;

class Node{
	int key;
	Node left;
	Node right;
	public Node(int key){
		this.key = key;
		left = right = null;
	}
}

public class Traversal_Of_Tree_Recursive
{
	public static void tree_inorder(Node node){
		if(node == null){
			return;
		}
		tree_inorder(node.left);
		System.out.print(node.key + " ");
		tree_inorder(node.right);
	}
	
	public static void tree_preorder(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.key + " ");
		tree_preorder(node.left);
		tree_preorder(node.right);
	}
	
	public static void tree_postorder(Node node){
		if(node == null){
			return;
		}
		tree_postorder(node.left);
		tree_postorder(node.right);
		System.out.print(node.key + " ");
	}

	public static void main(String[] args) {
		//Traversal_Of_Tree tTree = new Traversal_Of_Tree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.print("Inorder traversal of binary tree is: ");
		tree_inorder(root);
		System.out.print("\n" + "Preorder traversal of binary tree is: ");
		tree_preorder(root);
		System.out.print("\n" + "Postorder traversal of binary tree is: ");
		tree_postorder(root);
		
	}
	
}
