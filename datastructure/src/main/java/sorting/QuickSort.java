package main.java.sorting;

public class QuickSort {

	
	public static void main(String[] args)
	{
		Comparable[] a={7,10,8,4,3,21,6,18,1,9,20};
		
		quicksort(a);
		print(a);
	}
	
	public static void print(Comparable[] a)
	{
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
	System.out.print(" "+a[i]);	
		System.out.println(" ");
	}
	public static void quicksort(Comparable[] a)
	{
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a,int low,int high)
	{
		if(high<=low)
		{
			return;
		}
		int j=partition(a, low, high);
		print(a);
		sort(a, low, j-1);
		print(a);
		sort(a, j+1, high);
		print(a);
	}
	
	public static int partition(Comparable[] a,int lo, int hi)
	{
		Comparable pivot=a[lo];
		int i=1;
		int j=hi;
		System.out.println(" a[lo] "+a[lo]);
		System.out.println(" a[i] "+a[i]);
		System.out.println(" a[j] "+a[j]);
		while(true)
		{
			while(less(a[i],a[lo]))
			{
				System.out.println(" less(a[i],a[lo])");
				i++;
				if(i==hi)
				{
					break;
				}
				
			}
			
			while(less(a[lo],a[j]))
			{
				System.out.println("less(a[lo],a[j])");
				j--;
				if(j==lo)
				{
					break;
				}
			}
			
			if(i>=j)
			{
				break;
			}
			
			swap(a,i,j);
			System.out.println("swap(a,i,j)");
			print(a);
			
		}
		swap(a, j, lo);
		System.out.println("swap(a, j, lo);");
		print(a);
		System.out.println("partitioning at :- "+j +" value:-"+a[j]);
		return j;
	}
	
	private static void swap(Comparable[] a, int j, int i) {
		// TODO Auto-generated method stub
		Comparable swap=a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	private static boolean less(Comparable a, Comparable b) {
		// TODO Auto-generated method stub
		return a.compareTo(b)<0;
	}
}
