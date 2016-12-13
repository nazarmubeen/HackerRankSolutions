package symboltable.binryserach;

import java.util.Iterator;

public class BSTClient {

	public static void main(String[] args)
	{
		BST root=new BST<>();
		
		root.put(21, "nazar");
		root.put(10, "mubeen");
		System.out.println(root.get(10));
		Iterable it= root.keys();
		
		Iterator itm=it.iterator();
		while(itm.hasNext())
		{
			System.out.println(itm.next());
		}
	}
}
