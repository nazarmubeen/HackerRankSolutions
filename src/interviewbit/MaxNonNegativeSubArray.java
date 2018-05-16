package interviewbit;

import java.util.Arrays;

public class MaxNonNegativeSubArray {

	public static void main(String[] args)
	{
		int[] A={   11,12,13,14,-3,15,16,37,-9,18,8 };
		print(maxset(A));
	}
	
	public static int[] maxset(int[] A) {
		
		long sum=0;long maxSum=0;
		int segmentLength=0;int maxSegmentLength=0;
		int startIndex=0;int endIndex=0;
		int maxStartIndex=0;int maxEndIndex=0;
		int start=0;
		
		for(int i=0;i<A.length;i++)
		{
			
			if(A[i]<0)
			{
				
				if(sum>=maxSum || ((sum==maxSum) && segmentLength>maxSegmentLength))
				{
					System.out.println(" change start and max "+i);
					maxStartIndex=startIndex;
					maxEndIndex=endIndex;
					System.out.println("maxStartIndex "+maxStartIndex);
					System.out.println("maxEndIndex "+maxEndIndex);
				}
				maxSegmentLength=Math.max(segmentLength,maxSegmentLength);
				segmentLength=0;
				sum=0;
				startIndex=0;
				endIndex=0;
				continue;
			}
			System.out.println(" startIndex " +startIndex+" at i "+i);
			if(startIndex==0 && startIndex==endIndex)
			{
			System.out.println(" check for i  stsrt "+i);
			startIndex=i;
			}
			sum=sum+A[i];
			segmentLength++;
			endIndex=endIndex+1;
			maxSum=Math.max(sum,maxSum);
			System.out.println(" sum "+sum+" at i "+i);
			System.out.println(" maxSum "+maxSum+" at i "+i);
		}
		
		if(sum>=maxSum ||((sum==maxSum) && segmentLength>maxSegmentLength))
		{
			maxStartIndex=startIndex;
			maxEndIndex=startIndex+endIndex-1;
		}
		else{
			maxEndIndex=maxStartIndex+maxEndIndex-1;
		}
		System.out.println(" startIndex "+startIndex);
		System.out.println("endIndex  "+endIndex);

		System.out.println(" maxStartIndex "+maxStartIndex);
		System.out.println("maxEndIndex  "+maxEndIndex);
		System.out.println("maxSum "+maxSum);
		System.out.println("maxSegmentLength "+maxSegmentLength);
		
		return Arrays.copyOfRange(A, maxStartIndex, maxEndIndex+1); 
    
	
	}
	
	
	static void print(int[] A)
	{
		System.out.println(" ");
		for(int i=0;i<A.length;i++)
		System.out.print(A[i]);
	}
}
