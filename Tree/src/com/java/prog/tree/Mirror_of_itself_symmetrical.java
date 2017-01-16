package com.java.prog.tree;
import java.util.LinkedList;
import java.util.Queue;

public class Mirror_of_itself_symmetrical {
	
	public static boolean isSymmetric(Node node){
		if(node == null)
			return true;
		Queue<Node> LeftQueue = new LinkedList<Node>();
		Queue<Node> RightQueue = new LinkedList<Node>();
		LeftQueue.add(node.left);
		RightQueue.add(node.right);
		while(!LeftQueue.isEmpty() && !RightQueue.isEmpty()){
			Node nLeft = LeftQueue.remove();
			Node nRight = RightQueue.remove();
			if(nLeft.key != nRight.key)
				return false;
			if(nLeft.left != null && nRight.right != null){
				LeftQueue.add(nLeft.left);
				RightQueue.add(nRight.right);
			}else{
				if((nLeft.left != null && nRight.right == null) ||
						(nLeft.left == null && nRight.right != null))
					return false;
			}
			if(nLeft.right != null && nRight.left != null){
				LeftQueue.add(nLeft.right);
				RightQueue.add(nRight.left);
			}else{
				if((nLeft.right != null && nRight.left == null) ||
						(nLeft.right == null && nRight.left != null))
					return false;
			}
		}
		return true;
	}
 public static void main(String[] args) {
     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(2);
     root.left.left = new Node(3);
     root.left.right = new Node(4);
     root.right.left = new Node(4);
     root.right.right = new Node(3);
 //    root.left.left.left = new Node(8);
     if (isSymmetric(root))
         System.out.println("Tree is symmentric/mirror image of itself");
     else
         System.out.println("Tree is assymmentric/not mirror image of itself");
}
}
