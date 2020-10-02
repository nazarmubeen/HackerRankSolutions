package algo.priorityQueues;

public class HeapSort<Key> {

	public void heapsort(Comparable[] pq)
	{
		int N=pq.length;
		
		for(int k=N/2;k>=0;k--)
		{
			
			sink(k,N,pq);	
			
		}
		System.out.println("build heap completed");
		print(pq);
		
		while(N>1)
		{
			System.out.println(" ");
			System.out.println("replacing "+pq[0]+" to "+pq[N-1]);
			swap(pq,0,N-1);
			
			N--;
			System.out.println("sinking "+pq[0]+" to "+pq[N-1]);
			sink(0,N-1,pq);
			System.out.println(" ");
			print(pq);
		}
	}
	
	
	
	public static void print(Comparable[] cmp)
	{
		for(int i =0;i<cmp.length;i++)
		{
			System.out.print(" "+cmp[i]);
		}
	}
	
	public void sink(int k,int N,Comparable[] pq)
	{
		
		while(2*k<=N)
		{
		int j=2*k;
		if((j+1)<N && less(pq,j,j+1))
		{
			j++;
		}
		if(!less(pq,k,j))
		{
			break;	
		}
		swap(pq,k,j);
		k=j;
		}
	}
	
	private boolean less(Comparable[] pq,int i,int j)
	{
		
		return pq[i].compareTo(pq[j])<0;
	}
	
	private void swap(Comparable[] pq,int i , int j)
	{
		Comparable k= pq[i];
		pq[i]=pq[j];
		pq[j]= k;
	}
}
