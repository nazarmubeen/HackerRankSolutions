package treeproblems_interviewBit;

public class PathSum {
	static boolean flag=false;
	public static void main(String[] args)
	{
		PathSum obj=new PathSum();
		TreeNode node=new TreeNode(1);
		System.out.println();
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(8);
		System.out.println(obj.hasPathSum(node, 23));
	}
	
	public int hasPathSum(TreeNode a, int b) {
		if (a == null)
			return 0;
		if (a.val == b && (a.left == null && a.right == null))
			return 1;
		else if (hasPathSum(a.left, b - a.val) == 1
				|| hasPathSum(a.right, b - a.val) == 1) {
			return 1;
		} else {
			return 0;
		}
	}

}
