package Algo.treeproblems_interviewBit;

import java.util.LinkedList;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args)
	{
		FlattenBinaryTreeToLinkedList obj=new FlattenBinaryTreeToLinkedList();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(7);
		node.left.right=new TreeNode(11);
		node.right.right=new TreeNode(15);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(20);
		node.right.left.right=new TreeNode(8);
		obj.flatten(node);
	}
	
	public TreeNode flatten(TreeNode a) {
	
		LinkedList<TreeNode> temp=new LinkedList<>();
		
		help(a,temp);
		a=flattenTree(temp);
		printTree(a);
		return a;
	}
	
	void help(TreeNode a,LinkedList<TreeNode> temp)
	{
		
		if(a==null){
			return;
		}
		System.out.print(" "+a.val);
		temp.add(a);
		help(a.left,temp);
		help(a.right,temp);
		
	}
	
	TreeNode flattenTree(LinkedList<TreeNode> temp)
	{
		TreeNode head=null;
		for(int i=0;i<temp.size();i++)
		{
			if(head==null)
			{
				head=temp.get(0);
			}
			
			else{
				
				TreeNode node=temp.get(i);
				head.right=node;
				head.left=null;
				head=head.right;
			}
			
			System.out.println(" head now "+head.val);
			
		}
		
		return temp.get(0);
	}
	
	void printTree(TreeNode node)
	{
		System.out.println(" ");
		TreeNode temp=node;
		while(temp!=null)
		{
			System.out.print(" "+temp.val);
			temp=temp.right;
		}
	}
}
