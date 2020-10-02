package Algo.dynamicprogramming;
/*
 * 
Given an unsorted array of integers, find the length of longest increasing subsequence. 
For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing sequence is [3, 7, 101], therefore the length is 3. Note that there may be more than one LIS combination, it is only necessary for you to return the length. 
Your algorithm should run in O(n2) complexity. 
 */
public class LongestIncreasingSequence {

	public static void main(String[] args)
	{
		int[] arr={10, 9,10, 2, 1, 3, 7, 101,5,12,15,13, 18,22,45,87};
		int longestlength=1;
		int longestlengthsum=1;
		System.out.println("length of array"+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			while((i+1)<arr.length && (arr[i+1])>arr[i])
			{
				System.out.println("longestlength="+longestlength+" "+arr[i]);
				longestlength++;
				i++;
				System.out.println("i="+i);
			}

			if((i+1)<arr.length && (arr[i+1])<arr[i])
			{
				System.out.println("reset");
				if(longestlengthsum<longestlength)
				longestlengthsum=longestlength;
				longestlength=1;
			}
			if(longestlengthsum<longestlength)
				longestlengthsum=longestlength;
			System.out.println("longestlengthsum="+longestlengthsum);
		}
		
	}
	
}
