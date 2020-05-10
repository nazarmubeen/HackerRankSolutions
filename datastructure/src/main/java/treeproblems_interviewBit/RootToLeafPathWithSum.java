package main.java.treeproblems_interviewBit;

import java.util.ArrayList;

public class RootToLeafPathWithSum {

	public static void main(String[] args)
	{
		RootToLeafPathWithSum obj=new RootToLeafPathWithSum();
		TreeNode node=new TreeNode(1);
		System.out.println();
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		//node.left.left=new TreeNode(-1);
		//node.left.right=new TreeNode(-1);
	//	node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
	//	node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(8);
		obj.pathSum(node,7);
	}
	
	
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null)
            return null;
        // temp.add(root.val);
        pathSum(root, sum, result, temp);
     //   System.out.println("result "+result);
        return result;
        
    }
    public void pathSum(TreeNode node, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if(node == null)
            return;
        System.out.println("current node "+node.val);
        int currentVal = node.val;
        temp.add(currentVal);
        if(node.left == null && node.right == null){
            if(sum - currentVal == 0){
                result.add(new ArrayList<Integer>(temp));
            }
        }
        pathSum(node.left, sum - node.val, result, temp);
        pathSum(node.right, sum - node.val, result, temp);
        System.out.println("temp "+temp);
        temp.remove(temp.size() - 1);
        
    }
}
