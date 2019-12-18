package trees;

public class SortedArrayToTree {

	public static void main(String[] args)
	{
		int[] arr ={5,5,8,10,45,67,98,110};
		Node root=buildTree(arr);
		TreeOperations.inOrderTraverse(root);
		
	}
	
	static Node buildTree(int[] arr)
	{
		Node root=null;
		root=sortedArrayToBST(arr,0,arr.length-1);
		return root;
	}
	

	
	public static Node sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		Node root = new Node(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}
	
}
