package interviewbit.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagLevelOrderBT {
   
	static boolean zigzag=false;
	
	public static void main(String[] args)
	{
		ZigZagLevelOrderBT obj=new ZigZagLevelOrderBT();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(7);
		node.left.right=new TreeNode(11);
		node.right.right=new TreeNode(15);
		node.right.left=new TreeNode(4);
		node.right.left.left=new TreeNode(20);
		node.right.left.right=new TreeNode(8);
	//	obj.zigzagLevelOrder(node);
		obj.zigzagLevelOrder2(node);
		
	}
	
	//optimised
	 public ArrayList<ArrayList<Integer>> zigzagLevelOrder2(TreeNode a) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        if(a == null)
	            return result;
	        
	        boolean leftToRight = true;
	        
	        int currentLevelNum = 1;
	        int nextLevelNum = 0;
	        
	        System.out.println("offer" +queue.offer(a));
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        while(!queue.isEmpty()){
	            TreeNode node = queue.poll();
	            System.out.println(" node value poll "+node.val);
	            currentLevelNum--;
	            if(leftToRight)
	                list.add(node.val); // add at end
	            else
	                list.add(0, node.val); //add at beginning of list
	            
	            if(node.left != null){
	            	
	                queue.offer(node.left);
	                nextLevelNum++;
	                
	            System.out.println("node left nextLevelNum "+nextLevelNum);
	            }
	            if(node.right != null){
	                queue.offer(node.right);
	                nextLevelNum++;
	                System.out.println("node right nextLevelNum "+nextLevelNum);
	            }
	            
	            if(currentLevelNum == 0){
	            	System.out.println("currentLevelNum "+currentLevelNum);
	                currentLevelNum = nextLevelNum;
	                nextLevelNum = 0;
	                leftToRight = !leftToRight; // reverse the order
	                result.add(list);
	                list = new ArrayList<Integer>();
	            }
	        }
	        return result;
	        
	    }
	
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		LinkedList<TreeNode> list=new LinkedList<TreeNode>();
		LinkedList<TreeNode> q=new LinkedList<>();
		helper(a,q,list,result);
		
		result.remove(result.size()-1);
		System.out.println(" result is "+result);
		return result;
		
	}
	
	
	void helper(TreeNode t,LinkedList<TreeNode> q,LinkedList<TreeNode> list,ArrayList<ArrayList<Integer>> result){
		
		if(t==null)
		{
			return;
		}
		
		
		q.addFirst(t);
		result.add(new ArrayList<Integer>(printList(q,zigzag)));
		while(!q.isEmpty())
		{
			//System.out.println(q.getLast().val);
			TreeNode node=q.removeLast(); 
			list.addFirst(node);
			if(q.isEmpty() && !list.isEmpty())
			{
			System.out.println(" q is empty ");
			while(!list.isEmpty())
			{
			TreeNode node1=list.removeLast();
			if(node1.left!=null)
			q.addFirst(node1.left);
			if(node1.right!=null)
			q.addFirst(node1.right);
			}
			}
			else{
				continue;
			}
			System.out.println(" print q");
			
			
			result.add(new ArrayList<Integer>(printList(q,zigzag)));
			if(zigzag==false)
			{
				zigzag=true;
			}
			else{
				zigzag=false;
			}
		}
		
		
	}
	
	ArrayList<Integer> printList(LinkedList<TreeNode> q,boolean zigzag)
	{
		ArrayList<Integer> newList=new ArrayList<Integer>();
		for(TreeNode t:q)
		{
			System.out.print(" "+t.val);
			newList.add(t.val);
		}
		System.out.println(" ");
		if(zigzag=true)
		{
			Collections.reverse(newList);
		}
	return newList;	
	}
}
