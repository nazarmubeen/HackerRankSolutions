package main.java.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class PreOrderInorderToTree {
	static int preIndex = 0;
	public static void main(String[] args)
	{
		PreOrderInorderToTree obj=new PreOrderInorderToTree();
		ArrayList<Integer> preorder=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> inorder=new ArrayList<Integer>(Arrays.asList( 3, 2, 4, 1, 5));
	obj.buildTree(preorder, inorder);
	}
	
	public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
	
	
	return makeTree(preorder,inorder,0,preorder.size()-1);
	
	
	}
	
	public TreeNode makeTree(ArrayList<Integer> pre,ArrayList<Integer> in, int inStrt, int inEnd) {
		
		
		 if (inStrt > inEnd) 
	            return null;
	  
	        /* Pick current node from Preorder traversal using preIndex
	           and increment preIndex */
		 System.out.println("preIndex "+preIndex);
		 	TreeNode tNode = new TreeNode(pre.get(preIndex++));
	  System.out.println(" t node "+tNode.val);
	        /* If this node has no children then return */
	        if (inStrt == inEnd)
	            return tNode;
	  
	        /* Else find the index of this node in Inorder traversal */
	        int inIndex = in.indexOf(tNode.val);
	  
	        /* Using index in Inorder traversal, construct left and
	           right subtress */
	        tNode.left = makeTree(in, pre, inStrt, inIndex - 1);
	        tNode.right = makeTree(in, pre, inIndex + 1, inEnd);
	  
	        return tNode;
	}
}
