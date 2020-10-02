package algo.arrays;

import algo.u.ArrayUtilFunc;

public class MaxDistance {

	public static void main(String[] args)
	{
		
		int[] arr={3, 5,4,2};
		System.out.println(maximumGap(arr));
		
	}
	

	static int max(int x, int y) 
    {
        return x > y ? x : y;
    }
 
    static int min(int x, int y) 
    {
        return x < y ? x : y;
    }
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maximumGap(final int[] A) {
        int maxDiff;
        int i, j;
        int n = A.length;
 
        int RMax[] = new int[n];
        int LMin[] = new int[n];
 
        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = A[0];
        for (i = 1; i < n; ++i)
            LMin[i] = min(A[i], LMin[i - 1]);
        
       ArrayUtilFunc.printArray(LMin);
 
        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = A[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = max(A[j], RMax[j + 1]);
        
        ArrayUtilFunc.printArray(RMax);
        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = -1;
        while (j < n && i < n) 
        {
            if (LMin[i] <= RMax[j]) 
            {
                maxDiff = max(maxDiff, j - i);
                j = j + 1;
            } 
            else
                i = i + 1;
        }
 
        return maxDiff;
    }
/*	public static int maximumGap(final int[] A) {
	    int max=-1;int size=A.length;
	    HashMap<Integer,Integer> index=new HashMap<>();
	    for(int i=0;i<A.length;i++)
	    {
	    	index.put(A[i], i);
	    }
	    
	    Arrays.sort(A);
	    
	    for(int i=0;i<A.length;i++)
	    {
	    	for(int j=i+1;j<A.length;j++)
	    	{
				int diff=index.get(A[j])-index.get(A[i]);
				max=Math.max(max, diff);
				System.out.println(" max of "+A[i]+"and "+A[j]+" is "+max);
	    	}
	    }
	
	return max;
	}*/
	
}
