package main.java.priorityQueues;

public class HeapSortClient {

	public static void print(Comparable[] cmp)
	{
		for(int i =0;i<cmp.length;i++)
		{
			System.out.print(" "+cmp[i]);
		}
	}
	public static void main(String[] args)
	
	{
		Comparable[] cmp={1,3,6,5,8,9,4,7,56,1,25};
		
		HeapSort<Integer> heapsort=new HeapSort<>();
		heapsort.heapsort(cmp);
		print(cmp);
		
	}
}
