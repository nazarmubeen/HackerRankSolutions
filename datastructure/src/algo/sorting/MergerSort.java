package algo.sorting;

public class MergerSort {


	
	public static void merge(Comparable[] a,Comparable[] aux, int low,int high , int mid)
	{
		System.out.println("merging from "+low+" to "+high);
		for(int i=low;i<=high;i++)
		{
			aux[i]=a[i];
		}
		
		int i=low;
		int j=mid+1;
		for(int k=low;k<=high;k++)
		{
			
			
			 if(j>high)
			{
				System.out.println("j reached to max:- position "+i+" = "+aux[i]+" is copied to position "+k);
				a[k]=aux[i];
				i++;
			}
			
			else if(i>mid)
			{
				System.out.println("i reached max:- position "+j+" = "+aux[j]+" is copied to position "+k);
				a[k]=aux[j];
				j++;
			}
			
			else if(less(aux[i],aux[j]))
			{
				System.out.println(a[i] + " is less than "+a[j]);
				a[k]=aux[i];
				i++;
			}
			else 
			{
				System.out.println(a[j] + " is less than "+a[i]);
				a[k]=aux[j];
				j++;
			}
		}	
		
	}
	
	
	public static void sort(Comparable[] a)
	{
		Comparable[] aux=new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, Comparable[] aux,int low,int high)
	{
		System.out.println("Array is from "+ low +" to "+high);
		
		if(high<=low)
		{
			
			return;
		}
		
		
		int mid=low+(high-low)/2;
		
		System.out.println("mid identified as= " +mid);
		
		sort(a, aux, low, mid);
		sort(a, aux, mid+1, high);
		merge(a, aux, low, high, mid);
		
	}
	
	
	
	private static boolean less(Comparable a, Comparable b) {
		// TODO Auto-generated method stub
		return a.compareTo(b)<0;
	}

	
	public static void main(String[] args)
	{
		
	Comparable[] mergestring={7,1,5,2,8,12,9,2};;
	
		sort(mergestring);
		print(mergestring);
	}
	
	public static void print(Comparable[] a)
	{
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
	System.out.print(" "+a[i]);	
		System.out.println(" ");
	}
	
}
