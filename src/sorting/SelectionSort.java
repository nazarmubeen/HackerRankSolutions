package sorting;

public class SelectionSort<Item>{

	
	public static void sort(Comparable[] a)
	{
		int N=a.length;
		
		for(int i=0;i<N;i++)
		{
			int min=i;
			for(int j=i+1;j<N;j++)
			{
				if(less(a[j], a[min]))
					min=j;
			}
				swap(a, i, min);
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
}
