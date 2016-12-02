package symboltable.binryserach;

public class BSTClient {

	public static void main(String[] args)
	{
		BST root=new BST<>();
		
		root.put(21, "nazar");
		root.put(10, "mubeen");
		System.out.println(root.get(10));
	}
}
