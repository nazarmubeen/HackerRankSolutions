package stack;

import java.util.LinkedList;

import LinkedList.Node;


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
