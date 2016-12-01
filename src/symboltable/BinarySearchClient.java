package symboltable;

public class BinarySearchClient {

	public static void main(String[] args)
	{
		
		BinarySerach<Integer,String> table=new BinarySerach<>(5);
		table.put(11, "nazar");
		table.put(21, "mubeen");
		System.out.println(table.get(11));
		
	}
}
