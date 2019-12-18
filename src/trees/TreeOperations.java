package trees;

public class TreeOperations {

	Node root;
	
	
	
	public static Node binaryTreeInsert(Node root ,int data)
	{
		
		
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else{
		
		if(root.data>data)
		{			
			root.left=binaryTreeInsert(root.left ,data);
		}
		else
		{	
			root.right=binaryTreeInsert(root.right ,data);
		}
		}
		
		return root;
		
	}
	
	public Node insertLeft(int data,Node root)
	{
		Node newnode=new Node(data);
		if(root==null)
		{
			root=newnode;
			return root;
		}
		
		Node temp=root;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		
	
		temp.left=newnode;
		
		return root;
		
		
	}
	
	public Node insertRight(int data,Node root)
	{
		Node newnode=new Node(data);
		if(root==null)
		{
			root=newnode;
			return root;
		}
		
		Node temp=root;
		while(temp.right!=null)
		{
			temp=temp.right;
		}
		temp.right=newnode;
		
		return root;
		
	}
	
	
	public static void preOrderTraverse(Node root)
	{
		if(root==null)
			return;
		System.out.print(" -> " +root.data);
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
	public static void inOrderTraverse(Node root)
	{
		if(root==null)
			return;
		
		inOrderTraverse(root.left);
		System.out.print(" -> " +root.data);
		inOrderTraverse(root.right);
	}
	
	
	public static int sizeOfTree(Node root)
	{
		
		if(root==null)
		{
			return 0;
		}
		else{
		return (sizeOfTree(root.left)+sizeOfTree(root.right)+1);
		}
	}
	
	
	public static int maxDepth(Node node) 
	    {
	        if (node == null)
	            return 0;
	        else
	        {
	            int lDepth = maxDepth(node.left);
	            int rDepth = maxDepth(node.right);
	  
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	             else
	                return (rDepth + 1);
	        }
	    }
	
	static Node generateTree()
	{
		Node root=new Node(7);
		TreeOperations.binaryTreeInsert(root,3);
		TreeOperations.binaryTreeInsert(root,18);
		TreeOperations.binaryTreeInsert(root,2);
		TreeOperations.binaryTreeInsert(root,5);
		TreeOperations.binaryTreeInsert(root,11);
		TreeOperations.binaryTreeInsert(root,21);
		TreeOperations.binaryTreeInsert(root,1);
		TreeOperations.binaryTreeInsert(root,6);
		TreeOperations.binaryTreeInsert(root,19);
		return root;
	}
	
	static Node generateNormalTree(Node root )
	{
		 root=new Node(50);
		 root.left=new Node(30);
		 root.right=new Node(60);
		 root.left.left=new Node(5);
		 root.left.right=new Node(20);
		 root.right.left=new Node(45);
		 root.right.right=new Node(70);
		 root.right.right.left=new Node(65);
		 root.right.right.right=new Node(80);
		 System.out.println("completed");
		return root;
	}
	
	static Node generateNormalTree2(Node root )
	{
		 root=new Node(50);
		 root.left=new Node(30);
		 root.right=new Node(60);
		 root.left.left=new Node(15);
		 root.left.right=new Node(80);
		 root.right.left=new Node(45);
		 root.right.right=new Node(70);
		 root.right.right.left=new Node(65);
		 root.right.right.right=new Node(80);
		 System.out.println("completed");
		return root;
	}
	
}
