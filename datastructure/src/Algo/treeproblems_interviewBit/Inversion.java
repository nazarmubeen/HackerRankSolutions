package Algo.treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Inversion {

	public static void main(String[] args)
	{
		Inversion obj=new Inversion();
		ArrayList<Integer> a =new ArrayList<Integer>(Arrays.asList(59,29,5,1,2,34));
		obj.countInversions(a);
	}
	
	// two elements A[i] and A[j] form an inversion if A[i] > A[j] and i < j
	public int countInversions(ArrayList<Integer> a) {
		
		
		HashMap<Integer,Integer> map=new HashMap<>();
		int totalCount=0;
		for(int i=0;i<a.size();i++)
		{
			int count=0;
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(j)<a.get(i))
				{
					count++;
				}
			}
			
			map.put(a.get(i), count);
			System.out.println("map = "+map);
		
			totalCount=totalCount+count;
			count=0;
		}
		
		return totalCount;
	}
}
