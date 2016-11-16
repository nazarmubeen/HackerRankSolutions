package com.oops.generics;

public class PairDemo {

	public static void main(String[] args)
	{
		
		Pair<Integer> pair=new Pair<>(3, 4);
		System.out.println(pair);
		pair=pair.swap();
		System.out.println(pair);
		
		Pair<Integer> pair1=new Pair<>(33, 45);
		System.out.println(pair1);
		pair.swap(pair1);;
		System.out.println(pair1);
		
	}
}
