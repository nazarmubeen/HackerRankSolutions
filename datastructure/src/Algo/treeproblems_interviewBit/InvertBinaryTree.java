package Algo.treeproblems_interviewBit;

public class InvertBinaryTree {

	public static void main(String[] args)
{
	InvertBinaryTree obj=new InvertBinaryTree();
	TreeNode node=new TreeNode(1);
	node.left=new TreeNode(2);
	node.right=new TreeNode(3);
	node.left.left=new TreeNode(-1);
	node.left.right=new TreeNode(-1);
	node.right.right=new TreeNode(-1);
	node.right.left=new TreeNode(4);
	node.right.left.left=new TreeNode(-1);
	node.right.left.right=new TreeNode(5);
	obj.invertTree(node);
}
	
	
	public TreeNode invertTree(TreeNode root) {
		
		if(root==null)
		{
			return root;
		}
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
    }
}
