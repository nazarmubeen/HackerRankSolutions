package Algo.trees;

public class MainClass {
	
	public static void main(String[] args)
	{
	
		TreeOperations top=new TreeOperations();
		
	/*	Node root=new Node(10);
	
		top.insertLeft(20, root);
		top.insertLeft(30, root);
		top.insertRight(15, root);
		TreeOperations.preOrderTraverse(root);
		*/
		
		Node root2=new Node(5);
		top.binaryTreeInsert(root2, 11);
		top.binaryTreeInsert(root2, 8);
		top.binaryTreeInsert(root2, 3);
		top.binaryTreeInsert(root2, 5);
		TreeOperations.preOrderTraverse(root2);
		
		
		Node root3=top.generateTree();
		int size=top.sizeOfTree(root3);
		System.out.println(" ");
		System.out.println("size is "+size);
		System.out.println(" ");
		System.out.println("maxdepth is "+top.maxDepth(root3));
		
		
	}

	
	
	
}
