package Algo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSetsw {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(4, 2, 2, 2, 7, 7, 5, 8, 7, 1));
		
		ArrayList<ArrayList<Integer>> subsetsWithDup=subsetsWithDup(a);
		System.out.println("subsetsWithDup "+subsetsWithDup);
	}
	
public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
	    
	    Collections.sort(a);
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    
	    res.add(temp);
	    createSubsets(res, temp, a, 0);
	    
	    return res;
	    
	}
	
	public static void createSubsets(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, ArrayList<Integer> a, int index)
	{
	    for(int i = index;i < a.size(); i++)
	    {
	        if( i > index && a.get(i) == a.get(i-1))
	        {
	            continue;
	        }
	        temp.add(a.get(i));
	        res.add(new ArrayList<Integer>(temp));
	        createSubsets(res, temp, a, i+1);
	        temp.remove(temp.size() - 1);
	    }
	}

}
