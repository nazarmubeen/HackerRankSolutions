package Algo.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LavelOrderTraversal {

	public static void main(String[] args)
	{

		Node root=TreeOperations.generateTree();
		
		Queue<Node> queue=new LinkedList<>();
		
		visitTree(root,queue);
		
	}
	
	
	
	static void visitTree(Node root,Queue<Node> q)
	{
		System.out.println("Lavel Order Traversing ");
		preOrderTraverse( root, q);
		
	}
	
	
	public static void preOrderTraverse(Node root,Queue<Node> q)
	{
		
		if(root==null)
		{
			return ;
		}
		
		System.out.print(" "+root.data);
		
			if(null!=root.left)
			q.add(root.left);
			
			if(null!=root.right)
			q.add(root.right);
			preOrderTraverse(q.poll(),q);
		}
		
	
	

}
