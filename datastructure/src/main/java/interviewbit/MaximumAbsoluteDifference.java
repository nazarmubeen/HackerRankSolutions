package main.java.interviewbit;

public class MaximumAbsoluteDifference {

	public static void main(String[] args)
	{
		int[] A={1,3,-1};
		
		System.out.println("maxsum = "+maxArr2(A));
	}
	
	
	public static int maxArr(int[] A)
	{
		int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		
		for(int i=0;i<A.length;i++)
		{
			// Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);
            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2,  A[i] - i);
			
		}
		
		return Math.max(max1 - min1, max2 - min2);
	}
	
	
	
	
	public static int maxArr2(int[] A) {
    
		int maxSum=0,sum=0;
		for(int i=0;i<A.length-1;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
			sum=func(i,j,A);
			System.out.println("sum = "+sum);
			if(maxSum<sum || maxSum==0)
			{
				maxSum=sum;
			}
			}
			sum=0;
		}
	
		return maxSum;
	}
	
	static int func(int i,int j,int[] A)
	{
		return Math.abs(A[i]-A[j])+Math.abs(i-j);
	}
}
