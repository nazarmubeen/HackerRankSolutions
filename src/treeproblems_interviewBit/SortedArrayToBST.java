package treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedArrayToBST {

	public static void main(String[] args)
	{
		SortedArrayToBST obj=new SortedArrayToBST();
		
		List<Integer> alist=new ArrayList<Integer>(Arrays.asList(0,1,3,4,5,6,7,8));
		obj.sortedArrayToBST(alist);
	}
	
	
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		
		
		
		return creatTree(a,0,a.size()-1);
		
		
	}
	
	TreeNode creatTree(final List<Integer> a,int leftIndex,int rightIndex)
	{	
		if(leftIndex >rightIndex)
		{
			return null;
		}
		
		int mid=(rightIndex+leftIndex)/2;
		System.out.println("current Element "+a.get(mid));
		TreeNode root=new TreeNode(a.get(mid));
		root.left=creatTree(a,leftIndex,mid-1);
		root.right=creatTree(a,mid+1,rightIndex);
		return root;
	}
	
	

}
