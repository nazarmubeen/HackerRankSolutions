package main.java.interviewbit;

import java.util.Arrays;

public class MaxNonNegativeSubArray {

	public static void main(String[] args)
	{
		int[] A={ -8,1,2,5,-7,15,16,-2,-3,2,3,2,31};
		print(maxset(A));
	}
	
	public static int[] maxset(int[] A) {
		
		int startIndex=0;int endindex=0;int maxSegmentLength=0;long maxSum=0;
		
		int start=0,end=0,segmentLength=0;
		long sum=0;
		
		for(int i=0;i<A.length;i++)
		{
			if(start==0 && end==0)
			{
			start=i;
			}
			
			if(A[i]>=0)
			{
			sum=sum+A[i];
			end=end+1;
			segmentLength++;
			}
			else if(A[i]<0){
				System.out.println("else if for "+A[i]+" at i "+i+" where sum is "+sum);
				System.out.println("segment Length "+segmentLength);
				if(sum==maxSum && segmentLength>maxSegmentLength)
				{
					startIndex=start;
					endindex=end;
					maxSegmentLength=segmentLength;
				}
				else if(sum>maxSum)
				{
					startIndex=start;
					endindex=end;
					maxSum=sum;
					maxSegmentLength=segmentLength;
				}
				
				sum=0;
				segmentLength=0;	
				end=0;
				start=0;
			}

			
			System.out.println("start "+start);
			System.out.println("end  "+end);
			System.out.println("startIndex "+startIndex);
			System.out.println("endindex "+endindex);
			System.out.println(" i at "+i+" length "+A.length);
			if(i==A.length-1 && ((sum>maxSum) || (sum==maxSum && segmentLength>maxSegmentLength))) {
				System.out.println(" last index check");
				startIndex=start;
				endindex=end;
				maxSum=sum;
			}
		}
		
		return Arrays.copyOfRange(A, startIndex,startIndex+endindex); 
		
	}
	
	
	static void print(int[] A)
	{
		System.out.println(" ");
		for(int i=0;i<A.length;i++)
		System.out.print(A[i]);
	}
}
