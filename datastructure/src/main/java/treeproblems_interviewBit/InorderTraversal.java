package main.java.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class InorderTraversal {

	public static void main(String[] args)
	{
		InorderTraversal obj=new InorderTraversal();
		
		
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1 ,2 ,3 ,-1 ,-1 ,4 ,-1 ,-1 ,5 ,-1 ,-1));
	
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(-1);
		node.left.right=new TreeNode(-1);
		node.right.right=new TreeNode(-1);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(-1);
		node.right.left.right=new TreeNode(5);
		
		//obj.printTree(node);
		obj.inorderTraversal(node);
	}

void printTree(TreeNode node)
{
	if(node==null)
	{
		return;
	}

		System.out.println(node.val);
		printTree(node.left);
		printTree(node.right);
	
}

 public ArrayList<Integer> inorderTraversal(TreeNode a) {        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(a == null)
            return result;
        TreeNode node = a;
        //Go all the way to the left and then start poping add the val and go to the right
        while(!stack.isEmpty() || node != null){
        	
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();
                if(node.val!=-1)
                result.add(node.val);
                node = node.right;
            }
        }
        System.out.println(" result ="+result);
        return result;
    }


}
