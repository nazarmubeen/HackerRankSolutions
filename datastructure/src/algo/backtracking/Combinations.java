package algo.backtracking;

import java.util.ArrayList;


public class Combinations {

	public static void main(String[] args)
	{
		System.out.println(combine(4,3));
	}
	
	
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     
    	if (n <= 0 || n < k)
    		return result;
     
    	ArrayList<Integer> item = new ArrayList<Integer>();
    	helper(n, k, 1, item, result); 
     	return result;
    }
    private static void helper(int n, int k, int start, ArrayList<Integer> item,
    		ArrayList<ArrayList<Integer>> res) {
    	
    	if (item.size() == k) {
    		res.add(new ArrayList<Integer>(item));
    		return;
    	}
     
    	for (int i = start; i <= n; i++) {
    		item.add(i);
    		helper(n, k, i + 1, item, res);
    		item.remove(item.size() - 1);
    	}
    }
	
}
