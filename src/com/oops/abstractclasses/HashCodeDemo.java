package com.oops.abstractclasses;


//equal object same hash code
//same hashcode doesn't mean equal objects
public class HashCodeDemo {

	private boolean[] numbers=new boolean[100];
	
	public void store(int num)
	{
		numbers[num]=true;
	}
	
	public boolean Isstore(int num)
	{
		return numbers[num];
	}
	
	
	public static void main(String[] args)
	{
		HashCodeDemo demo=new HashCodeDemo();
		System.out.println(demo.Isstore(2));
		demo.store(2);
		System.out.println(demo.Isstore(2));
		
	}
}
