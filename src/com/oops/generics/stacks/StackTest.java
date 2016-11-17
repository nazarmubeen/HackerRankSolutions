package com.oops.generics.stacks;

import java.util.Iterator;

public class StackTest {

	public static void main(String[] args)
	{
		Stack<String> stringstack=new Stack<>();
		Stack<Integer> intstack=new Stack<>();
		
		String str="nazar mohd mubeen address hyderabad india";
		
		String[] items=str.split(" ");
		for(String item : items)
		{
			stringstack.push(item);
		}
		/*System.out.println(stringstack.size());
		while(!stringstack.isEmpty())
		{
			System.out.println(stringstack.pop());
			
		}
		*/
		Iterator it=stringstack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
