package main.java.trees;

public class FlattenTreeToList {

	public static void main(String[] args)
	{
		Node root=TreeOperations.generateTree();
		flattenTree(root);
		TreeOperations.inOrderTraverse(root);;
	}

	static void flattenTree(Node root)
{	
		if(root==null)
		{
			return;
		}
		
		Node rightmostofleft=rightMost(root.left);
		//System.out.println("right data"+root.right.data);
		
		if(rightmostofleft!=null){
			System.out.println(rightmostofleft.data);
			rightmostofleft.right=root.right;
				root.right=root.left;
				root.left=null;
		}
		
		flattenTree(root.right);
		
}
	

	public static Node rightMost(Node root) {
	    if (root == null) {
	        return null;
	    }
	    if (root.right == null) {
	        return root;
	    }
	    return rightMost(root.right);
	}

}
