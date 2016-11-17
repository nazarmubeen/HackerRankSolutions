package com.oops.generics.stacks;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{

	private Node head=null;
	
	private class Node{
		Item item;
		Node next;
		
		public Node()
		{
			next=null;
		}
	}
	
	int size()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
			
		}
		return count;
	}
	
	boolean isEmpty()
	{
		return head==null;
	}
	
	void push(Item item)
	{
		Node n=new Node();
		n.item=item;
		if(head==null)
		{
			head=n;
			return;
		}
		n.next=head;
		head=n;
	}
	
	Item pop()
	{
		Node top=head;
		head=top.next;
		top.next=null;
		return top.item;
	}

	@Override
	public Iterator<Item> iterator() {
		
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item>{

		private Node temp=head;
		
		@Override
		public boolean hasNext() {
			
			return temp!=null;
		}

		@Override
		public Item next() {
			
			Item item=temp.item;
			temp=temp.next;
			return item;
		}
		
	}
}
