package treeproblems_interviewBit;

public class SymmetricBinaryTree {

	public static void main(String[] args)
	{
		SymmetricBinaryTree obj=new SymmetricBinaryTree();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(2);
		node.left.left=new TreeNode(3);
		node.left.right=new TreeNode(4);
		node.right.right=new TreeNode(3);
		node.right.left=new TreeNode(4);
		/*node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);*/
		System.out.println(obj.isSymmetric(node));
	}
	
	public int isSymmetric(TreeNode a) {
	
		if(isMirror(a,a)==false)
			return 0;
		else{
			return 1;
		}
	
	
	}
	
	boolean isMirror(TreeNode node1,TreeNode node2)
	{
		// if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null)
            return true;
  
        // For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if (node1 != null && node2 != null && node1.val == node2.val)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
  
        // if neither of the above conditions is true then
        // root1 and root2 are mirror images
        return false;
	}
	
}
