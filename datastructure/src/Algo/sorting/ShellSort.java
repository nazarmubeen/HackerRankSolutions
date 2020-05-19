package Algo.sorting;

public class ShellSort{
	
	
	private static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	
	private static void swap(Comparable[] a,int i,int j){
		Comparable swap=a[i];
		a[i]=a[j];
		a[j]=swap;
	}

	public static void sort(Comparable[] a)
	{
		int N=a.length;
		int h=1;
		while(h<N/3)
		{
			h=3*h+1;
		}
		System.out.println("h= "+h);
		while(h>=1)
		{
			for(int i=h;i<N;i++)
			{
				System.out.println("i= "+i);
				
				for(int j=i;j>=h && less(a[j],a[j-h]);j-=h)
				{
					System.out.println(" ");
					System.out.print("j= "+j+" j-h ="+(j-h));
					swap(a,j,j-h);
				}
				System.out.println(" ");
			}
			h=h/3;
			System.out.println("h= "+h);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		Comparable[] a={12,25,1,3,25,9,-8,1,4,5,62};
		sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}
	
}
