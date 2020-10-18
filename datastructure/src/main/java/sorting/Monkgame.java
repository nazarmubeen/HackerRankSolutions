package main.java.sorting;

import java.util.Arrays;

public class Monkgame {
	
	static int functionG(int a, int[] arr)
	{
		int count=0;
		int i=arr.length-1;
		while(i>=0  && arr[i]>a)
		{
			System.out.println("a= "+a+"arr[i]= "+arr[i]);
			count++;
			i--;
		}
		////System.out.println("bigger ="+count);
		//System.out.println("smaller="+(arr.length-count));
		
		return count*(arr.length-count) ;
	}
	
/*	static int functionF(int a, int[] arr)
	{
		int count=0;
		int i=0;
			while(arr[i]<a && i<arr.length-1)
			{
				count++;
				i++;
			}
		
		return count;
	
	}*/
	
	static int scoreSum(int[] arr1,int[] arr2)
	{
		int sum=0;
		int total=0;
		for(int i=0;i<arr1.length;i++)
		{
			
			if((i-1)>0 &&arr1[i]==arr1[i-1])
			{
				sum=sum+total;
			}
			else{
				total=functionG(arr1[i],arr2);
				sum=sum+total;
			}
				
			//System.out.println("sum="+sum);
			
		}
		
		return sum;
	}
	public static void main(String[] args)
	{
		
		int N=10;
		int M=15;
		int A[]={1,3,35,65,-8,89,8,8,69,-101};
		int B[]={0,5,12,-98,34,56,58,58,98,10};
		/*
		int scoreA=scoreSum(A, B);
	//	System.out.println("scoreA"+scoreA);
		int scoreB=scoreSum(B,A);
	//	System.out.println("scoreB"+scoreB);
		
		if(scoreA>scoreB)
		{
			System.out.println("Monk"+" "+(scoreA-scoreB));
		}
		else if(scoreA>scoreB){
			System.out.println("!Monk"+" "+(scoreB-scoreA));
		}
		else{
			System.out.println("Tie");
		}
		
		   Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
			int M = s.nextInt();
			System.out.println(N+M);
			int A[]=new int[N];
			int B[]=new int[M];
		
	        for (int i = 0; i < N; i++) {
	            A[i]=s.nextInt();
	        }
	        
	         for (int i = 0; i < M; i++) {
	            B[i]=s.nextInt();
	        }
	     */	    
	        Arrays.sort(A);
	        Arrays.sort(B);

	 		int scoreA=scoreSum(A, B);
	 		System.out.println("scoreA"+scoreA);
	 		int scoreB=scoreSum(B,A);
	 		System.out.println("scoreB"+scoreB);
	 		
	 		if(scoreA>scoreB)
	 		{
	 			System.out.println("Monk"+" "+(scoreA-scoreB));
	 		}
	 		else if(scoreA>scoreB){
	 			System.out.println("!Monk"+" "+(scoreB-scoreA));
	 		}
	 		else{
	 			System.out.println("Tie");
	 		}
	      
	}
}
