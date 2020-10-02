package Algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumWithoutAdjacentElemnt {

	public static void main(String[] args)
	{
		MaxSumWithoutAdjacentElemnt obj=new MaxSumWithoutAdjacentElemnt();
		ArrayList<Integer> first=new ArrayList<Integer>(Arrays.asList(16, 5, 54, 55, 36, 82, 61, 77, 66, 61));
		ArrayList<Integer> second=new ArrayList<Integer>(Arrays.asList(31, 30, 36, 70, 9, 37, 1, 11, 68, 14));
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		a.add(first);
		a.add(second);
		obj.adjacent(a);
	//	obj.adjacent2(a);
	}
	
	public int adjacent(ArrayList<ArrayList<Integer>> a) {
		int[] arr=new int[a.get(0).size()];
		arr[0] = Math.max(a.get(0).get(0), a.get(1).get(0));
		arr[1] = Math.max(a.get(0).get(1), a.get(1).get(1));
		arr[1] = Math.max(arr[0], arr[1]);
		
		int i=2;
		while(i<a.get(0).size())
		{
			arr[i]=arr[i-2]+Math.max(a.get(0).get(i),a.get(1).get(i));
			arr[i]=Math.max(arr[i],arr[i-1]);
			i++;
		}

	System.out.println("arr");
		for(int k = 0; k < a.get(0).size(); k++)
            System.out.print(arr[k] + "  ");
		System.out.println(" ");
		return arr[arr.length-1];
	
	
	}
	
	 public  int adjacent2(ArrayList<ArrayList<Integer>> a) {
	        if(a == null || a.size() == 0)
	            return 0;
	        
	        int m = a.size();
	        int n = a.get(0).size();
	        if(n == 0)
	            return 0;
	        
	        int[] dp = new int[n];
	        ArrayList<Integer> first = a.get(0);
	        ArrayList<Integer> second = a.get(1);
	        
	        dp[0] = Math.max(first.get(0), second.get(0));
	        
	        if(n < 2)
	            return dp[0];
	        
	        dp[1] = Math.max(first.get(1), second.get(1));
	        dp[1] = Math.max(dp[0], dp[1]);
	        
	        for(int i = 2; i < n; i++){
	            dp[i] = Math.max(first.get(i), second.get(i));
	            dp[i] += dp[i-2];
	            dp[i] = Math.max(dp[i], dp[i-1]);
	        }
	        
	        for(int j = 0; j < n; j++)
	            System.out.print(dp[j] + "  ");
	        return dp[n-1];
	    }
}
