package interviewbit.treeproblems_interviewBit;

public class MinDepthOfBinaryTree {
	public static void main(String[] args)
	{
		MinDepthOfBinaryTree obj=new MinDepthOfBinaryTree();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);
		System.out.println(obj.minDepth(node));
	}
	
	public int minDepth(TreeNode a) {
	
		if(a==null)
		{
			return 0;
		}
		if(a.left == null)
	         return minDepth(a.right) + 1;
	     if(a.right == null)
	         return minDepth(a.left) + 1;
		
		int left=minDepth(a.left)+1;
		int right=minDepth(a.right)+1;
		
		return (Math.min(left, right));
	}
}
