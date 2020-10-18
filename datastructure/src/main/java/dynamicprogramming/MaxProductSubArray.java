package main.java.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
Return an integer corresponding to the maximum product possible.

Example :

Input : [2, 3, -2, 4]
Return : 6 

Possible with [2, 3]
 */
public class MaxProductSubArray {

	public static int maxProduct(final List<Integer> a) {
		int sum=1,maxsum=0;
		
		for(int i=0;i<a.size();i++)
		{
			sum=a.get(i);
			if(maxsum<a.get(i))
			{
				maxsum=a.get(i);
			}
			
			for(int j=i+1;j<a.size();j++)
			{
				sum=a.get(j)*sum;
				System.out.println("sum="+sum);
				if(sum>maxsum)
				{
					maxsum=sum;
				}
				
				
			}
			sum=1;
			
		}
		
		return maxsum;
		
	}
	
	public static void main(String[] args)
	{
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(-2);
		a.add(4);
		System.out.println(maxProduct(a));
		
	}
}
