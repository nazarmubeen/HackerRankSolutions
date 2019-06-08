package Arrays;

import java.util.Arrays;

public class MaximumUnsortedSubarray {

	public static void main(String[] args)
	{
		int[] arr={ 1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15};
		subUnsort(arr);

	}
	
	 public static  int[] subUnsort(int[] A) {
		 int maxindex=-1;
		 int minindex=1;
		 int size=A.length;
		 for(int j=A.length-1;j>0;j--)
		 {
			 if(A[j]>A[j-1])
				 continue;
			 else{
				 maxindex=j;
				 break;
			 }
		 }
		 
		 if(maxindex==-1)
		 {
			 return new int[]{-1};
		 }
		 
		 for(int i=1;i<A.length-1;i++)
		 {
				 if(A[i]<=A[i+1])
					 continue;
				 else{
					 minindex=i;
					 break;
				 }
		 }
		 
		 System.out.println(" max index "+maxindex);
		 System.out.println(" min index "+minindex);
		 
		 return new int[]{A[minindex],A[maxindex]};
	    }
}
