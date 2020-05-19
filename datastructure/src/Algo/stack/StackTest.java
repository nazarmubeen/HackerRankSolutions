package Algo.stack;

public class StackTest {

	public static void main(String[] args)
	{
		StackOfStrings s=new StackOfStrings();
		String str="nazar mohd mubeen address hyderabad india";
		
		String[] items=str.split(" ");
		for(String item : items)
		{
			s.push(item);
		}
		
		System.out.println(s.size());
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
			
		}
		
	}
}
