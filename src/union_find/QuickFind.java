package union_find;

public class QuickFind {

	private static int[] numbers;
	
	//initialize array
	public QuickFind(int N)
	{
		numbers=new int[N];
		
		for(int i=0;i<=N-1;i++)
		{
			numbers[i]=i;
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
