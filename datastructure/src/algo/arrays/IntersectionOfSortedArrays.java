package algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>(Arrays.asList(10000000));
		List<Integer> b=new ArrayList<Integer>(Arrays.asList(10000000));
		
		ArrayList<Integer> newList=intersect(a,b);
		System.out.println(newList);
	}
	
	public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
		ArrayList<Integer> newList=new ArrayList<>();
		
		
		int i=0;
		int j=0;
	
		while(j<b.size() && i<a.size())
		{
	//	System.out.println(" i = "+i+" j = "+j);
	//	System.out.println(a.get(i));
	//	System.out.println(b.get(j));
			if(a.get(i).equals(b.get(j)))
			{
				newList.add(a.get(i));
				i++;
				j++;
			}
			else if(a.get(i)<b.get(j))
			{
				i++;
			}
			else if(a.get(i)>b.get(j))
			{
				j++;
			}
			
			
		}
		
		
		
		return newList;
	
	}
}
