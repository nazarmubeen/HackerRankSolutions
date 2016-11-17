package sorting;

public class ClientSorting {

	public static void main(String[] args)
	{
		Integer a[]={5,8,2,6,9,56,12,5,1,89};
		SelectionSort.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
