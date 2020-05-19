package Algo.treeproblems_interviewBit;

public class BalancedBinaryTree {
	public static void main(String[] args){
	BalancedBinaryTree obj=new BalancedBinaryTree();
	TreeNode node=new TreeNode(1);
	node.left=new TreeNode(2);
	node.right=new TreeNode(3);
	node.left.left=new TreeNode(-1);
	node.left.right=new TreeNode(-1);
	node.right.right=new TreeNode(-1);
	node.right.left=new TreeNode(4);
	node.right.left.left=new TreeNode(-1);
	node.right.left.right=new TreeNode(5);
	obj.isBalanced(node);
	}
	
	public int isBalanced(TreeNode a) {
		
		 if(a == null)
	            return 1;
	        int leftDepth = 0;
	        int rightDepth = 0;
	        if(a.left != null)
	            leftDepth = height(a.left);
	        if(a.right != null)
	            rightDepth = height(a.right);
	        if(Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(a.left) == 1 && isBalanced(a.right) == 1)
	            return 1;
	        return 0;
	}
	
	public int height(TreeNode node)
	{
		 if(node == null)
	            return 0;
	        return 1 + Math.max(height(node.left), height(node.right));
		
	}
	
	
}
