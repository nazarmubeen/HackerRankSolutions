package trees;

public class LargestBSTSubTree {

	public static void main(String[] args)
	{
		Node root = null;
		root=TreeOperations.generateNormalTree(root);
		TreeOperations.preOrderTraverse(root);
		System.out.println(" ");
		System.out.println(largestBSTSubtree(root,0));
	}
	
	static int largestBSTSubtree(Node root,int max)
	{

		System.out.println("data "+root.data+"max "+max);
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		
		if(root.left.data<root.data && root.right.data>root.data)
		{
			int left=largestBSTSubtree(root.left,max);
			System.out.println("left= "+left);
			int right=largestBSTSubtree(root.right,max);
			System.out.println("right= "+right);

			if(left!=0 && right!=0)
			max= Math.max(left,right)+1;
			else if(left==0){
				return right;
			}
			else{
				return left;
			}
			return max;
		}
		else{
			return 0;
		}
		
		
	}
	

}
