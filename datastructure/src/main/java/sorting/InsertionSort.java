package main.java.sorting;

public class InsertionSort {

	
	
	public static void sort(Comparable[] a)
	{
		int i=0;
		while(i!=a.length)
		{
			for(int j=i;j>0;j--)
			{
				if(less(a[j],a[j-1]))
				{
					swap(a, j, j-1);
				}
				else
					break;	
			}
			
			for(int k=0;k<a.length;k++)
			{
				System.out.print(" "+a[k]);
			}
			System.out.println(" ");
			System.out.println(" i now "+i);
			i++;
		}
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
	
	public static void main(String[] args)
	{
		Integer a[]={5,8,2,6,9,56,12,5,1,89};
		InsertionSort.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
