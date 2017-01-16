package com.java.prog.tree;
import java.util.LinkedList;
import java.util.Queue;

public class Size_Height_ofA_Tree {
	public static int size(Node node){
		if(node == null)
			return 0;
		int size_tree = 0;
		Node root = node;
		Queue<Node> sizeQueue = new LinkedList<Node>();
		sizeQueue.add(root);
		while(!sizeQueue.isEmpty()){
			root = sizeQueue.poll();
			size_tree++;
			if(root.left != null)
				sizeQueue.add(root.left);
			if(root.right != null)
				sizeQueue.add(root.right);
		}
		return size_tree;
	}
	
	public static int height(Node node){
		if(node == null)
			return 0;
		Queue<Node> heightQueue = new LinkedList<Node>();
		int tree_height = 0;
		heightQueue.add(node);
		while(1 == 1){
			int root_count = heightQueue.size();
			if(root_count == 0)
				return tree_height;
					
			while(root_count != 0){
				Node currentNode = heightQueue.remove();
				if(currentNode.left != null){
					heightQueue.add(currentNode.left);
				}
				if(currentNode.right != null){
					heightQueue.add(currentNode.right);
				}
				root_count--;
			}
			tree_height++;
		}
	}
}
