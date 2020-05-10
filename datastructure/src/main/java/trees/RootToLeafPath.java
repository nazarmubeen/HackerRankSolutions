package main.java.trees;

import java.util.ArrayList;

public class RootToLeafPath {
	
	public static void main(String[] args)
	{
		
		Node root=TreeOperations.generateTree();
		int size=TreeOperations.sizeOfTree(root);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println(" ");
		rootTOLeafPath(root,arr);
		System.out.println(" ");
		System.out.println("leaf nodes");
		System.out.println(countLeafNodes(root,0));
	}
	
	public static void rootTOLeafPath(Node root,ArrayList<Integer> arr)
	{
		arr.add(root.data);
		
		if(null==root.left && null==root.right)
		{
			print(arr);
			arr.remove(arr.size()-1);
			return ;
		}
	
		if(root.left!=null)
		rootTOLeafPath(root.left,arr);
		if(root.right!=null)
		rootTOLeafPath(root.right,arr);
		
		arr.remove(arr.size()-1);
		
	}

	public static int countLeafNodes(Node root,int c)
	{
	
		
		if(null==root.left && null==root.right)
		{
			return c=c+1;
		}
		if(root.left!=null)
		c=countLeafNodes(root.left,c);
		if(root.right!=null)
		c=countLeafNodes(root.right,c);
		
		return c;
		
	}
	
	static void print(ArrayList<Integer> arr){
		System.out.println(" ");
		
		for(int i:arr){
			System.out.print(" "+i);
		}
		
	}
}
