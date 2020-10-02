package algo.stack;

import java.util.LinkedList;


public class StackOfStrings {

	LinkedList<String> list;
	
	public StackOfStrings() {
		
		list=new LinkedList<>();
	}

	void push(String item )
	{
		list.add(item);
	}
	
	String pop()
	{
		return list.removeLast();
	}
	
	boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	int size()
	{
		return list.size();
	}
}
