package com.java.prog.tree;
import java.util.LinkedList;
import java.util.Queue;

public class Check_identical {
	public static void main(String[] args) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.left.left.left = new Node(16);
		root1.left.left.right = new Node(6);
		root1.right.left = new Node(7);
		root1.right.left.right = new Node(8);
		root1.right.left.right.left = new Node(9);
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.left.left.left = new Node(16);
		root2.left.left.right = new Node(6);
		root2.right.left = new Node(7);
		root2.right.left.right = new Node(8);
		root2.right.left.right.left = new Node(9);
		root2.right.left.right.right = new Node(19);
		
		if (identical_check_iterative(root1, root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
	}

/* By recursive method*/
	public static boolean identical_check(Node node1, Node node2) {
		if((node1 == null) && (node2 == null)){
			return true;
		}
		
		if(((node1 != null) && (node2 == null)) || ((node1 == null) && node2 != null))
				return false;
		
		if(node1 != null && node2 != null){
			return 	(node1.key == node2.key)
					&& (identical_check(node1.left, node2.left))
					&& (identical_check(node1.right, node2.right));
		}
		return false;
	}
	
/*By Iterative method*/
	public static boolean identical_check_iterative(Node node1, Node node2) {
		if((node1 == null) && (node2 == null)){
			return true;
		}
		
		if(((node1 != null) && (node2 == null)) || ((node1 == null) && node2 != null))
				return false;
		
		Queue <Node> iStack1 = new LinkedList<Node>();
		Queue <Node> iStack2 = new LinkedList<Node>();
		
		iStack1.add(node1);
		iStack2.add(node2);
		while(!iStack1.isEmpty() && !iStack2.isEmpty()){
			Node first1 = iStack1.remove();
			Node first2 = iStack2.remove();
			if(first1.key != first2.key){
				return false;
			}
			
			if(first1.left != null && first2.left != null){
				iStack1.add(first1.left);
				iStack2.add(first2.left);
			}else
				if((first1.left != null && first2.left == null) || (first1.left == null && first2.left != null))
					return false;
			
			if(first1.right != null && first2.right != null){
				iStack1.add(first1.right);
				iStack2.add(first2.right);
			}else
				if((first1.right != null && first2.right == null) || (first1.right == null && first2.right != null))
				return false;
		}
		return true;
	}
		
	
}
