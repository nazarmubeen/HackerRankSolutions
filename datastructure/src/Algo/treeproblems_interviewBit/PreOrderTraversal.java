package Algo.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args)
	{
		PreOrderTraversal obj=new PreOrderTraversal();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);
		obj.preorderTraversal(node);
	}
	
public ArrayList<Integer> preorderTraversal(TreeNode a) {
		
		ArrayList<Integer> result=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		TreeNode node=a;
		
		while(!stack.isEmpty() || node!=null)
		{
			while(node!=null)
			{
				if(node.val!=-1)
				result.add(node.val);
				stack.push(node);
				node=node.left;
			}
			
			TreeNode top=stack.pop();
			
			node=top.right;
		
		}
		
		System.out.println(" result "+result);
		return result;
		
}
}
