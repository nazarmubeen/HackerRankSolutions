package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {

	
	public static void main(String[] args)
	{
		Permutations obj=new Permutations();
		
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(" alist "+alist);

		obj.permute(alist);
	}
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		boolean[] used=new boolean[a.size()];
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> bf=new ArrayList<Integer>();
		combine(a,bf,result,used);
		System.out.println("result "+ result);
		return result;
		
	}
	
	public void combine(ArrayList<Integer> a,ArrayList<Integer> bf,ArrayList<ArrayList<Integer>> result,boolean[] used)
	{
		if(a.size()==bf.size())
		{
			result.add(new ArrayList<Integer>(bf));
			System.out.println(" bf "+bf);
			return;
		}
		
		for(int i=0;i<a.size();i++)
		{
			if(used[i])
			{
			System.out.println("current character = "+a.get(i)+ " already in string ");
			continue;
			}
			
			bf.add(a.get(i));
			used[i]=true;
			combine(a,bf,result,used);
			used[i]=false;
			System.out.println("removing = "+bf.get(bf.size()-1)+ "  in string ");
			bf.remove(bf.size()-1);
			
		}
		

	}
	

}
