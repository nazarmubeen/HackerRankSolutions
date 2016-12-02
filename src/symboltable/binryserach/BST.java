package symboltable.binryserach;

public class BST<Key extends Comparable<Key>,Value> {

	private Node root;
	
	public void put(Key key,Value value)
	{
		System.out.println("inserting key ="+key+" value="+value);
		
			root=put(root,key,value);;
		
		System.out.println("root value"+root.value);
		
	}
	
	private Node put(Node x,Key key,Value value)
	{
		if(x==null)
		{
			System.out.println("root is null creating node");
			return new Node(key,value);
		}
		
		int cmp=key.compareTo((Key) x.key);
		if(cmp<0)
		{
			System.out.println("key is smaller going left");
			x.left=put(x.left,key,value);
		}
		else if(cmp>0)
		{
			System.out.println("key is larger going right");
			x.right=put(x.right,key,value);
		}
		else if(cmp==0)
		{
			System.out.println("key is present changing value");
			x.value=value;
		}
		
		System.out.println("returning rot to ="+x.key);
		return x;
	}
	
	public Value get(Key key)
	{
		Node x=root;
		
		System.out.println("searching for key "+key);
		
		while(x!=null)
		{
			System.out.println("key of x is="+x.key);
			int cmp=key.compareTo((Key) x.key);
			if(cmp<0){
				System.out.println("key is smaller than root going left");
				x=x.left;
			}
			else if(cmp>0)
				{
				System.out.println("key is larger than root going right");
				x=x.right;
				}
			else if(cmp==0){
				System.out.println("key is equal to root returning value");
				return (Value) x.value;
			}	
		}
		return null;	
	}

	public void delete(Key key)
	{
		
	}


	public class Node<Key ,Value> {

		private Key key;
		private Value value;
		private Node left,right;
		
		public Node(Key key,Value value)
		{
			this.key=key;
			this.value=value;
		}

	}

}
