
package union_find;

import java.util.Arrays;


public class UnionFind {
	
	private static int[] numbers;
	
	//initialize array
	public UnionFind(int N)
	{
		numbers=new int[N];
		
		for(int i=0;i<=N-1;i++)
		{
			numbers[i]=i;
		}
	}

	//connect p and q
	////too slow takes Quadratic time
	public void union(int p,int q)
	{
		int from=numbers[p];
		int to=numbers[q];
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			if(numbers[i]==from)
			{
				numbers[i]=to;
			}	
	
		}
	}
	
	// check if p and q is connected
	boolean connected(int p,int q)
	{
		return (numbers[p]==numbers[q]);
		
	}
	
	int find(int p)
	{
		return 0;
	}
	
	//return number of connected components
	int count()
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
