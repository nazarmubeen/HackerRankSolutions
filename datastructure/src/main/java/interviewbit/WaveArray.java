package main.java.interviewbit;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args)
	{
		
		int[] A={6,5,3,8,9};
		wave(A);
		
	}
	
	public static int[] wave(int[] A) {
    
		Arrays.sort(A);
		print(A);
		
		for(int i=0;i<A.length;i=i+2)
		{
			if(i!=A.length-1)
			swap(A,i);
		}
		print(A);
		return A;
	
	}
	
	static void swap(int[] A,int i)
	{
		int temp=A[i];
		A[i]=A[i+1];
		A[i+1]=temp;
	}
	
	static void print(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(" "+A[i]);
		}
		System.out.println(" ");
	}
}
