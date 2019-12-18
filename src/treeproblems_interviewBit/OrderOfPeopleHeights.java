package treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class OrderOfPeopleHeights {
	
	public static void main(String[] args)
	{
		OrderOfPeopleHeights obj=new OrderOfPeopleHeights();
		ArrayList<Integer> heights=new ArrayList<>(Arrays.asList(86, 92, 49, 21, 62, 27, 90, 59));
		ArrayList<Integer> infronts=new ArrayList<>(Arrays.asList(2, 0, 0, 2, 0, 2, 1, 3));
		obj.order(heights, infronts);
	}
	public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
	
		ArrayList<Integer> order=null;
		Integer[] arr=new Integer[heights.size()];
		boolean[] arrCheck=new boolean[heights.size()];
		TreeMap<Integer,Integer> map=new TreeMap<>();
		
		for(int i=0;i<heights.size();i++)
		{
			map.put(heights.get(i), infronts.get(i));
		}
		
		System.out.println("map ="+map);
		
		for(int k:map.keySet())
		{
			System.out.println("key is "+k);
			int j=0;
			int i=0;
			for(;j<=map.get(k) && i<arr.length;i++)
			{
				System.out.println(" arrr check at i "+i +" "+arrCheck[i]);
				if(!arrCheck[i])
				{
					j++;
			//	System.out.println("j ="+j);

				}
	
			}
			System.out.println(" index "+i+" for key "+k);
			arr[i-1]=k;
			arrCheck[i-1]=true;		
		}
		order=new ArrayList<>(Arrays.asList(arr));
		System.out.println("order "+order);
		return order;
	
	
	}
}
