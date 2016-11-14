package com.oops.conceptdemo;

import java.util.*;

public class CommonDataStructures {

	public static void main(String[] args)
	{
		
		//get and put operations are easy 
		ArrayList<Integer> alist=new ArrayList<Integer>();
		int i=0;
		while(i!=5)
		{
			alist.add( ((i+(int)Math.random())*(23)));
			i++;
		}
		
		for (int a : alist) {
			System.out.print(a+" ");
		}
		i=0;
		System.out.println("");
		
		//add and remove complexity is better
		//it also implements Queue interface
		LinkedList<Integer> llist=new LinkedList<>();
	
		while(i!=5)
		{
			llist.add( ((i+(int)Math.random())*(23)));
			i++;
		}
		
		for (int a : llist) {
			System.out.print(a+" ");
		}
		i=0;
		System.out.println("");
		
		/*
		 * Sets contain no duplicate values
		 *  HashSet are implemented using hash table and elements are not ordered
		 *  Tree set is implemented using tree algorithm (red-black tree) and elements are sorted
		 *  Linked Hash set provide order of insertion and developed on hastable
		 *   using linked list running through it
		 *  
		 */
		
		/*
		 * MAPS
		 * 
		 * HashMap not ordered (need to implement hashcode and toequals methods
		 * 
		 * String color;
 
	Dog(String c) {
		color = c;
	}
 
	public boolean equals(Object o) {
		return ((Dog) o).color.equals(this.color);
	}
 
	public int hashCode() {
		return color.length();
	}
 
	public String toString(){	
		return color + " dog";
	}
		 * TreeMap is sorted (need to implement comparable interface)
		 * LinkedHashMap is synchronized 
		 * 
		 */
	}
}
