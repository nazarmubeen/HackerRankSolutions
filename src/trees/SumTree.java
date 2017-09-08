package trees;

public class SumTree {

	public static void main(String[] args)
	{
		Node root=TreeOperations.generateTree();
		TreeOperations.preOrderTraverse(root);;
		System.out.println(" ");
		sum(root);
		TreeOperations.preOrderTraverse(root);;
	}
	
	static int sum(Node root){
		
		if(root==null)
		{
			return 0;
		}
		

		int old_val=root.data;
		root.data=root.data+sum(root.left)+sum(root.right);
		return root.data;
		
		
		
		
		
	}
}
