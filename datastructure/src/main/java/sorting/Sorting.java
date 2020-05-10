package main.java.sorting;

public class Sorting<Item> implements Comparable<Item>{

	@Override
	public int compareTo(Item o) {

		return this.compareTo(o);
	}

	public static void sort(Comparable[] a)
	{
		int N=a.length;
		for(int i=0;i<N;i++)
		{
			for(int j=i;j<N;j++)
			{
				if(a[j].compareTo(a[j-1])<0)
				{
					swap(a,j,j-1);
				}
				else
					break;
			}
		}
	}

	private static void swap(Comparable[] a, int j, int i) {
		// TODO Auto-generated method stub
		Comparable swap=a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	private static boolean isSorted(Comparable[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(less(a[i],a[i-1]))
				return false;
		}
		return true;
	}

	private static boolean less(Comparable a, Comparable b) {
		// TODO Auto-generated method stub
		return a.compareTo(b)<0;
	}
}
