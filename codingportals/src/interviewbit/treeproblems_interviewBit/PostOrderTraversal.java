package interviewbit.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args)
	{
		PostOrderTraversal obj=new PostOrderTraversal();
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
		obj.postorderTraversal(node);
	}
	
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		
		ArrayList<Integer> result=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		 if(a == null)
	            return result;
	        TreeNode node = a;
	        while(!stack.isEmpty() || node != null){
	        	
	            while(node != null){
	            	System.out.println("node now "+node.val);
	                if(node.right != null)
	                    stack.push(node.right);
	                stack.add(node);
	                node = node.left;
	            }
	            node = stack.pop();
	            
	            if(node.right != null && !stack.isEmpty() && node.right == stack.peek()){
	                TreeNode rightNode = stack.pop();
	                stack.push(node);
	                node = rightNode;
	            }
	            else{
	            	if(node.val!=-1)
	                result.add(node.val);
	                node = null;
	            }
	        }
	        System.out.println(" result "+result);
	        return result;
		
	
	}
}
