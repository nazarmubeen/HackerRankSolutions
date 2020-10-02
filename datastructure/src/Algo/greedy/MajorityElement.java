package Algo.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

	public static void main(String[] args)
	{
		MajorityElement obj=new MajorityElement();
		List<Integer> a=new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 2));
		int elem=obj.majorityElement(a);
		System.out.println(" elem "+elem);
	}
	public int majorityElement(final List<Integer> a) {
		
		if(a.size()==1)
		{
			return a.get(0);
		}
		
		int max=(int) Math.floor(a.size()/2);
		System.out.println(" max "+max);
		HashMap<Integer, Integer> map=new HashMap<>();
		
		
		for(int i=0;i<a.size();i++)
		{
			if(map.get(a.get(i))==null)
			{
				map.put(a.get(i), 1);
				System.out.println("map now first "+map);
			}
			else{
				map.put(a.get(i), map.get(a.get(i))+1);
				System.out.println("map now "+map);
				if(map.get(a.get(i))>max){
					System.out.println("return "+a.get(i));
					return a.get(i);
				}
			}
		}
		
		return 0;
		
	}
	
	
}
