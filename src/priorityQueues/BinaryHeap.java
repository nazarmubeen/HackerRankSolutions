package priorityQueues;

public class BinaryHeap<Key extends Comparable<Key>> {

	private Key[] pq;
	private int N=0;
	public BinaryHeap(int capacity)
	{
		pq=(Key[]) new Comparable[capacity+1];
	}
	
	public boolean isEmpty()
	{
		return N==0;
	}
	
	public void insert(Key key) {
		
		if(pq[1]==null)
		{
			pq[1]=key;
			N++;
		}
		
		else{
			pq[N+1]=key;
			N++;
			swim(N);
		}
		
	}
	
	public Key deleteMax()
	{
		Key max = pq[1];
		swap(1,N--);
		sink(1);
		pq[N+1]=null;
		return max;
	}
	
	public void swim(int k)
	{
		while(k>1 && less(k/2,k))
		{
			swap(k,k/2);
			k=k/2;
		}
	}
	
	public void sink(int k)
	{
		while(2*k<=N)
		{
		int j=2*k;
		System.out.println("max index="+k+" ="+pq[k]);
		if(j<N && less(j,j+1))
		{
			j++;
		}
		if(!less(k,j))
		{
			break;	
		}
		swap(k,j);
		k=j;
		}
	}
	
	private boolean less(int i,int j)
	{
		return pq[i].compareTo(pq[j])<0;
	}
	
	private void swap(int i , int j)
	{
		Key k=pq[i];
		pq[i]=pq[j];
		pq[j]=k;
	}
	
	
	public void print()
	{
		for(Key i : pq)
		{
			System.out.print(" "+i);
		}
	}
}
