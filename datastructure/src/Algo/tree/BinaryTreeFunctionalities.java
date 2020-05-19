package Algo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeFunctionalities {

	//height of a tree
	 public static int height(Node root)
	    {

		    if(root==null)
	          {
	            return -1;
	        }
		      
			int lheight= height(root.left)+1;
			
			int rheight= height(root.right)+1;
			 
			return Math.max(lheight, rheight);
}
	//Getting top view of the tree 
	 void top_view(Node root)
	 {
	          goLeft(root.left);
	            System.out.print(root.data+" ");
	 		 goRight(root.right);
	 }

	  
	 	 void goLeft(Node root)
	 	 {
	 		 if(root.left==null || root.right==null)
	 		 {
	              System.out.print(root.data+" ");
	 			 return;
	 		 }
	 		 
	 		 goLeft(root.left);
	 		 System.out.print(root.data+" ");
	 	 }
	 	 
	 	 void goRight(Node root)
	 	 {
	 		 if(root.left==null || root.right==null)
	 		 {
	             System.out.print(root.data+" ");
	 			 return;
	 		 }
	 		 System.out.print(root.data+" ");
	 		 goRight(root.right);
	 		 
	 	 }
	 	//Getting top view of the tree end

//level order traversal
	 	 
	 	void  level_order(Node root)
	 	{

	 		Queue<Node> q=new LinkedList<Node>();
	 		
	 		q.add(root);
	 		while(!q.isEmpty())
	 		{
	 			System.out.print(q.peek().data+" ");
	 			root= q.poll();
	 			if(root.left!=null)
	 			{
	 			q.add(root.left);
	 			}
	 			if(root.right!=null)
	 			{
	 			q.add(root.right);
	 			}
	 		}
      
	 		
	 	}

}
