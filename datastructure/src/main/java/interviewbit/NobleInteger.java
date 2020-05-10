package main.java.interviewbit;

import java.util.Arrays;

public class NobleInteger {

	public static void main(String[] args)
	{
		int[] A={-4, -2, 0,1,1 ,2,2,2,2,-1, -6 ,-6};
		System.out.println(solve(A));
	}
	
	
	public static int solve(int[] arr) {
    
		Arrays.sort(arr);
		 print(arr); 
        int n = arr.length;
        for (int i=0; i<n-1; i++)
        {
            if (arr[i] == arr[i+1])
                continue;

            if (arr[i] == n-i-1)
            {
            	System.out.println(" i "+i);
            	System.out.println("arr[i] "+arr[i]);
                return 1;
            }
        }
 
        if (arr[n-1] == 0)
        {
        	System.out.println(" n-1 "+(n-1));
        	System.out.println("arr[n-1] "+arr[n-1]);
            return 1;
        }
        
        return -1;
	
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
