package main.java.treeproblems_interviewBit;

public class MaxDepthOfBinaryTree {

	public static void main(String[] args)
	{
		MaxDepthOfBinaryTree obj=new MaxDepthOfBinaryTree();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);
		System.out.println(obj.maxDepth(node));
	}
	
	public int maxDepth(TreeNode a) {
	
		if(a==null)
		{
			return 0;
		}
		
		int left=maxDepth(a.left)+1;
		int right=maxDepth(a.right)+1;
		
		return (Math.max(left, right));
	}
}
