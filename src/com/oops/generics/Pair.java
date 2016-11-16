package com.oops.generics;

public class Pair<T> {
	T first;
	T second;
	
	
	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
	public Pair<T> swap()
	{
		return new Pair<T>(second, first);
	}
	
	public static <T> void swap(Pair<T> pair)
	{
		T temp= pair.first;
		pair.first=pair.second;
		pair.second=temp;
		
	}
	

	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
	

}
