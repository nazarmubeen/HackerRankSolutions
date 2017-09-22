package treeproblems_interviewBit;

import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Node;

public class KthSmallestElementTree {

	public static void main(String[] args)
	{
		KthSmallestElementTree obj=new KthSmallestElementTree();
		TreeNode node=new TreeNode(3);
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(8);
		
		System.out.println(obj.kthsmallest(node,3));
	}
	
	public int kthsmallest(TreeNode root, int k) {
		
		ArrayList<Integer> list=new ArrayList<>();
	    preOrder(root, list);
	    System.out.println(" list "+list);
		return list.get(k-1);
		
		
    }
	
	void preOrder(TreeNode root, ArrayList<Integer> list)
	{
		if(root==null)
		{
			return;
		}

		preOrder(root.left,list);
		if(root.val!=-1)
		list.add(root.val);
		preOrder(root.right,list);
		
	}
	
	
	
	
}
