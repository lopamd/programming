package com.java.prog.tree;
import java.util.Stack;

public class Level_order_spiralForm {
	public static void spiral_order(Node root){
		if(root == null)
			return;
		Stack<Node> S1 = new Stack<Node>();
		Stack<Node> S2 = new Stack<Node>();
		S1.push(root);
		while(!S1.isEmpty() || !S2.isEmpty()){
			while(!S1.isEmpty()){
				Node pop_node = S1.pop();
				System.out.print(pop_node.key + " ");
				if(pop_node.right != null)
					S2.push(pop_node.right);
				if(pop_node.left != null)
					S2.push(pop_node.left);
			}
			while(!S2.isEmpty()){
				Node pop_node = S2.pop();
				System.out.print(pop_node.key + " ");
				if(pop_node.left != null)
					S1.push(pop_node.left);
				if(pop_node.right != null)
					S1.push(pop_node.right);
			}
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.right = new Node(35);
		spiral_order(root);
	}
}
