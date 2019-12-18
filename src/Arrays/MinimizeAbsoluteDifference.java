package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimizeAbsoluteDifference {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1, 4, 5, 8, 10));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(6, 9, 15  ));
		ArrayList<Integer> c=new ArrayList<>(Arrays.asList(2, 3, 6, 6 ));
		int mindiff=solve(a,b,c);
		System.out.println(" mindiff "+mindiff);
	}
	
	 public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
		
		 int diff=Integer.MAX_VALUE;
		 
		 
		    // Traverse arrays
		    int i=0,j=0,k=0;
		    while (i < A.size() && j < B.size() && k < C.size())
		    {
		        // Find minimum and maximum of current three elements
		        int minimum = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
		        int maximum = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
		 
		        // Update result if current diff is less than the min
		        // diff so far
		        if (maximum-minimum < diff)
		        {
		             diff = maximum - minimum;
		        }
		 
		        // We can't get less than 0 as values are absolute
		        if (diff == 0) break;
		 
		        // Increment index of array with smallest value
		        if (A.get(i) == minimum) 
		        	i++;
		        else if (B.get(j) == minimum)
		        	j++;
		        else
		        	k++;
		    }
		 
		 return diff;
	    
	 }
}
