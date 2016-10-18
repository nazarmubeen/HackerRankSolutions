package tree;

/*
 * You are given a tree of N nodes where nodes are 
 * indexed from [1..N] and it is rooted at 1. You have
 *  to perform T swap operations on it, and after each 
 *  swap operation print the inorder traversal of the 
 *  current state of the tree.
 * 
 * 
 */
public class SwapNodes {
	

	
	
	
	static void inOrder(Node root) {

		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
		
	}
}

