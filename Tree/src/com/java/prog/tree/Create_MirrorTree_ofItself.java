package com.java.prog.tree;
import java.util.LinkedList;
import java.util.Queue;

public class Create_MirrorTree_ofItself {
	public static Node mirror(Node node){
		if(node == null)
			return node;
		Node root;
		Queue<Node> mirrorQ = new LinkedList<Node>();
		root = node;
		mirrorQ.add(root);
		while(!mirrorQ.isEmpty()){
			root = mirrorQ.remove();
			Node temp = root.right;
			root.right = root.left;
			root.left = temp;
			if(root.left != null)
				mirrorQ.add(root.left);
			if(root.right != null)
				mirrorQ.add(root.right);
		}
		return root;
	}

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }
	
	public static void main(String[] args) {
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        
	        inorder(root);
	        /* convert tree to its mirror */
	        System.out.println("Inorder traversal of input tree is :");
	        mirror(root);
	       inorder(root);
	}

}
