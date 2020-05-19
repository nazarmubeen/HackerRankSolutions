package Algo.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContArray {
	
	public static void main(String[] args)
	{
		List<Integer> A=new ArrayList<Integer>();
		
	}

	 // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int maxSubArray(final List<Integer> A) {
    	int maxEndingHere = A.get(0);
        int maxSoFar = A.get(0);
        
    for (int i = 1; i < A.size(); i++) {
        maxEndingHere = Math.max(A.get(i), A.get(i) + maxEndingHere);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;}
}
