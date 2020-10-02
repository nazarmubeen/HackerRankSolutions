package algo.arrays;

import java.util.*;

public class KthSmallesElementInArray {

	public static void main(String[] args)
	{
		final List<Integer> a=new ArrayList<>(Arrays.asList(2,1,4,3,2));
		System.out.println(kthsmallest(a,3));
		System.out.println(k(a,3));
	}
	
	
	//another way to do the same
	
	static int k(final List<Integer> A, int k)
	{

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : A) {
            queue.offer(num);
        System.out.println("queue "+queue);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
	}
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static int kthsmallest(final List<Integer> a, int k) {
		
		int element=Integer.MIN_VALUE;
		int count=0;
		while(count<k)
		{
		int[] arr=getMin(a,element);
		element=arr[0];
		System.out.println("elemnt "+arr[0]);
		System.out.println("element occurence"+arr[1]);
		count=count+arr[1];
		if(count>k)
		{
			return element;
		}
		System.out.println("count = "+count);
		}
		return element;
	}
	
	public static int[] getMin(List<Integer> a,int lastMin)
	{
		int min=Integer.MAX_VALUE;
		int[] arr=new int[2];
		System.out.println("lastMin ="+lastMin);
		for(int i=0;i<a.size();i++)
		{
			
			if(a.get(i)<=min && a.get(i)>lastMin)
			{	
			/*	System.out.println(" a get i"+a.get(i));
				System.out.println(" arr 1"+arr[1]);*/
				if(a.get(i).equals(min))
				{
				arr[1]=arr[1]+1;
				}
				else{
					min=a.get(i);
					arr[0]=min;	
					arr[1]=1;
				}
				
			}
		
			
		}	
		return arr;
		
	}
	
	
}
