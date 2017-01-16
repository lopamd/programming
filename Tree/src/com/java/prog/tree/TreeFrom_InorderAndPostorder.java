package com.java.prog.tree;

public class TreeFrom_InorderAndPostorder {
	static int pre_index = 0;
	public static Node buildTree(int in[],int pre[], int inStart, int inEnd){
		if(inStart > inEnd)
			return null;
		Node root = new Node(pre[pre_index++]);
		
		if(inStart == inEnd)
			return root;
		
		//find the root_index in Inorder
		int root_index = search(in, inStart, inEnd, root.key);
		root.left = buildTree(in, pre, inStart, root_index -1);
		root.right = buildTree(in, pre, root_index + 1, inEnd);
		
		return root;
	}
	  public static int search(int arr[], int strt, int end, int value) 
	    {
	        int i;
	        for (i = strt; i <= end; i++) 
	        {
	            if (arr[i] == value)
	                return i;
	        }
	        return i;
	    }
	  
	  public static void printInorder(Node node){
		  Node root = node;
		  if(root == null)
			  return;
		  printInorder(root.left);
		  System.out.print(root.key + " ");
		  printInorder(root.right);
	  }
	  
	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
        int in[] = new int[]{4, 2, 5, 1, 6, 3};
        int pre[] = new int[]{1, 2, 4, 5, 3, 6};
        int len = in.length;
        Node root = buildTree(in, pre, 0, len - 1);
  
        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        printInorder(root);
	}
}
