package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombinationSum2 {


	public static void main(String[] args)
	{
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(10,1,2,7,6,1,5 ));
		ArrayList<ArrayList<Integer>> combinationSum=combinationSum(arr,8);
		System.out.println(combinationSum);
	}
	
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 
	    if(a == null || a.size() == 0) return result;
	 
	    ArrayList<Integer> current = new ArrayList<Integer>();
	    Collections.sort(a);
	 
	    System.out.println(" array is "+a);
	    combinationSum(a, b, -1, current, result);
	 
	    return result;
	}
	
	
	public static void combinationSum(ArrayList<Integer> candidates, int target, int j, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
		   if(target == 0){
		       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
		       if(!result.contains(temp))
		       result.add(temp);
		       return;
		   }
		 
		   for(int i=j+1; i<candidates.size(); i++){
			   System.out.println(" i = "+i);
			   System.out.println("target "+target+" elemnt at i "+candidates.get(i));
		       if(target < candidates.get(i)) 
		            return;
		 
		       curr.add(candidates.get(i));
		       combinationSum(candidates, target - candidates.get(i), i, curr, result);
		       curr.remove(curr.size()-1); 
		   }
	}
}
