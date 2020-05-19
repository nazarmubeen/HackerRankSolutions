package Algo.treeproblems_interviewBit;

public class IdenticalBinaryTree {

	public static void main(String[] args)
	{
		IdenticalBinaryTree obj=new IdenticalBinaryTree();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);
		
		TreeNode node1=new TreeNode(1);
		node1.left=new TreeNode(2);
		node1.right=new TreeNode(3);
		node1.left.left=new TreeNode(-1);
		node1.left.right=new TreeNode(-1);
		node1.right.right=new TreeNode(-1);
		node1.right.left=new TreeNode(4);
		node1.right.left.left=new TreeNode(-1);
		node1.right.left.right=new TreeNode(15);
		System.out.println(obj.isSameTree(node,node1));
	}
	
	
	public int isSameTree(TreeNode a, TreeNode b) {
		
		
		
		if(a==null && b==null)
		{
			return 1;
		}
		
		if(a==null && b!=null)
		{
			return 0;
		}
		
		if(b==null && a!=null)
		{
			return 0;
		}
		if(a.val!=b.val)
		{
			return 0;
		}
       
		int left=isSameTree(a.left,b.left);
		int right=isSameTree(a.right,b.right);
		
		if(left==0 || right==0)
		{
			return 0;
		}
		else{
			return 1;
		}
		
		
		
	}
}
