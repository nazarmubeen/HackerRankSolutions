package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AllUniquePermutations {

	static boolean used[];
	public static void main(String[] args)
	{
		AllUniquePermutations obj=new AllUniquePermutations();
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,1,2));
		obj.permute(a);
	}
	
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<ArrayList<Integer>,Boolean> listMap=new HashMap<ArrayList<Integer>,Boolean>();
		used=new boolean[a.size()];
		helper(listMap,a,list,result);
		System.out.println(" result "+result);
		return result;
		
		
	}
	
	
	void helper(HashMap<ArrayList<Integer>,Boolean> listMap,ArrayList<Integer> a,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result)
	{
		if(list.size()==a.size())
		{
			System.out.println(" list "+list);
			if(!listMap.containsKey(list))
			{
				System.out.println(" first time");
			ArrayList<Integer> adlist=new ArrayList<>(list);
			result.add(adlist);
			listMap.put(adlist, true);
			}
			
		}
		for(int i=0;i<a.size();i++)
		{
			if(used[i]==false)
			{
				used[i]=true;
				list.add(a.get(i));
				helper(listMap,a,list,result);
				used[i]=false;
				list.remove(list.size()-1);
			}
		}
		
	}
}
