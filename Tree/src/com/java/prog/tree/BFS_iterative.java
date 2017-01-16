package com.java.prog.tree;
import java.util.LinkedList;
import java.util.Queue;


public class BFS_iterative {
	public static void tree_BFS(Node node){
		if(node == null)
			return;
		
		Node root = node;
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(root);
		while(!nodeQueue.isEmpty()){
			Node current_qNode = nodeQueue.remove();
			System.out.print(current_qNode.key + " ");
			if(current_qNode.left != null)
				nodeQueue.add(current_qNode.left);
			if(current_qNode.right != null)
				nodeQueue.add(current_qNode.right);
			
		}
	}
}
