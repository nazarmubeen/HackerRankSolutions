package tree;

public class BinarySearchTree {

	//insertion in binary search tree
	static Node Insert(Node mainroot,int value)
    {    
	    Node root=mainroot;
	    if(root==null)
        {
        	Node node=new Node();
	       	node.data=value;
        mainroot=node;
        return mainroot;
        
    }
	    
			if((value>root.data) && (root.right!=null) )
			{
	        //    System.out.println("going right");
			  root=Insert(root.right,value);
			}
			
			if((value<root.data) && (root.left!=null))
			{
	       //      System.out.println("going left");
				root=Insert(root.left,value);
			}
			
			if((value<root.data) && (root.left==null))
			{
	       //     System.out.println("going lreft creating node");
	          	Node node=new Node();
		       	node.data=value;
				root.left=node;
	            return mainroot;
			}
	    
			if((value>root.data) && (root.right==null) )
			{
	       //       System.out.println("going right creating node");
				Node node=new Node();
		       	node.data=value;
	            root.right=node;
	            return mainroot;
			}
		    
			
			return mainroot;  
    }
	
	
	
}
