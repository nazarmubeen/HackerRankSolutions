package Algo.union_find;

public class QuickFind {

	private  int[] numbers;
	private  int[] size;
	
	//initialize array
	public QuickFind(int N)
	{
		numbers=new int[N];
		size=new int[N];
		for(int i=0;i<=N-1;i++)
		{
			numbers[i]=i;
			size[i]=1;
		}
	}
	
	
	private int root(int i)
	{
		while(i!=numbers[i])
		{
			i=numbers[i];
		}
		return i;
	}

	//connect p and q
	public void union(int p,int q)
	{
		int from=root(p);
		int to=root(q);

		numbers[from]=to;
		
		printNumbers();
	}
	
	//connect p and q
	/*
	 * this method checks for condition to always 
	 * put small tree under large tree
	 * 
	 * 
	 */
		public void unionQuickWeighted(int p,int q)
		{
			int from=root(p);
			int to=root(q);
			
			if(size[to]>size[from])
			{	
			numbers[from]=to;
			size[to]+=size[from];
			}
			else{
				numbers[to]=from;
				size[from]+=size[to];
			}
			printNumbers();
		}
		
	
	// check if p and q is connected
	//this will be expensive
	boolean connected(int p,int q)
	{
		return (root(p)==root(q));
		
	}
	
	int find(int p)
	{
		return 0;
	}
	

	
	void printNumbers()
	{
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println(" ");
	}
}
