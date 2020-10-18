package main.java.arrays;

public class SameNumber {

    public static void main(String[] args) {
    	
    	int[] arr={1,4,2,3,7};
    	int N=6;
        solve(arr, N);
    }
    
    
    static void solve(int[] arr, int N){
        // Please write your code here
    int[] bagArray=new int[arr.length];
    	
    	if(N==0 || N==1)
    		System.out.println(-1+" "+-1);
    	SameNumber s=new SameNumber();
    	BST bst=s.new BST();
    	
    	
    	buildBagArray(arr,bst);
    	
    }
    
    
    static void buildBagArray(int[] arr, BST tree){
    	
    	System.out.println(-1+" "+-1);
    	Node root=tree.insert(null, arr[0]);
    	for(int i=1;i<arr.length;i++){
    		
    	Node n=	tree.findPredecessor(root, null, arr[i]);
    	int value;
    	if(n!=null)
    	value=n.data;
    	else{
    	value=-1;
    	}
    	Node u=tree.findSuccessor(root, null, arr[i]);
    	int newvalue;
    	if(u!=null)
    		newvalue=u.data;
    	else{
    		newvalue=- 1;
    	}
    	System.out.println(value+" "+newvalue);
    	root=tree.insert(root, arr[i]);
    		
    	}
    	
    }
    
    
 
    
    
    class Node
    {
    	int data;
    	Node left = null, right = null;

    	Node(int data) {
    		this.data = data;
    	}
    }

    class BST

    {
    	
    	// Helper function to find minimum value node in given BST
    	public Node findMinimum(Node root)
    	{
    		while (root.left != null) {
    			root = root.left;
    		}

    		return root;
    	}

    	// Recursive function to find inorder successor for given key in a BST
    	public Node findSuccessor(Node root, Node succ, int key)
    	{
    		// base case
    		if (root == null) {
    			return null;
    		}

    		// if node with key's value is found, the successor is minimum
    		// value node in its right subtree (if any)
    		if (root.data == key)
    		{
    			if (root.right != null) {
    				return findMinimum(root.right);
    			}
    		}

    		// if given key is less than the root node, recur for left subtree
    		else if (key < root.data)
    		{
    			// update successor to current node before recursing in 
    			// left subtree
    			succ = root;
    			return findSuccessor(root.left, succ, key);
    		}

    		// if given key is more than the root node, recur for right subtree
    		else {
    			return findSuccessor(root.right, succ, key);
    		}

    		return succ;
    	}
    	// Recursive function to insert an key into BST
    	public Node insert(Node root, int key) 
    	{
    		// if the root is null, create a new node an return it
    		if (root == null) {
    			return new Node(key);
    		}

    		// if given key is less than the root node, recur for left subtree
    		if (key < root.data) {
    			root.left = insert(root.left, key);
    		}

    		// if given key is more than the root node, recur for right subtree
    		else {
    			root.right = insert(root.right, key);
    		}

    		return root;
    	}

    	// Helper function to find maximum value node in given BST
    	public  Node findMaximum(Node root) {
    		while (root.right != null) {
    			root = root.right;
    		}

    		return root;
    	}

    	// Recursive function to find in-order predecessor for given key in a BST
    	public  Node findPredecessor(Node root, Node prec, int key)
    	{
    		// base case
    		if (root == null) {
    			return prec;
    		}

    		// if node with key's value is found, the predecessor is maximum
    		// value node in its left subtree (if any)
    		if (root.data == key) {
    			if (root.left != null) {
    				return findMaximum(root.left);
    			}
    		}

    		// if given key is less than the root node, recur for left subtree
    		else if (key < root.data) {
    			return findPredecessor(root.left, prec, key);
    		}

    		// if given key is more than the root node, recur for right subtree
    		else {
    			// update predecessor to current node before recursing 
    			// in right subtree
    			prec = root;
    			return findPredecessor(root.right, prec, key);
    		}
    		return prec;
    	}
    	
    	
    
    	    
  /*  	    // Function to floor and ceiling of x in arr[] 
    	    public static int[] floorAndCeil(int arr[], int x) 
    	    { 
    	        int n = arr.length; 
    	          
    	        int fInd = -1, cInd = -1; 
    	   
    	        int fDist = Integer.MAX_VALUE, cDist = Integer.MAX_VALUE; 
    	   
    	        for (int i = 0; i < n; i++) 
    	        { 

    	            if (arr[i] >= x && cDist > (arr[i] - x)) 
    	            { 
    	                cInd = i; 
    	                cDist = arr[i] - x; 
    	            } 
    	   
    	            if (arr[i] <= x && fDist > (x - arr[i])) 
    	            { 
    	                fInd = i; 
    	                fDist = x - arr[i]; 
    	            } 
    	        } 
    	   
    	        int floor=-1;
    	        int ceil=-1;
    	        
    	        if(!(fDist == Integer.MAX_VALUE)) 
    	            floor= arr[fInd]; 
    	   
    	        if(!(cDist == Integer.MAX_VALUE)) 
    	            ceil=arr[cInd]; 
    	        
    	        return new int[]{floor,ceil};
    	    } */
    	    

}
}
