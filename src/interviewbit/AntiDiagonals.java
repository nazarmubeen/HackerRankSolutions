package interviewbit;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class AntiDiagonals {

	
	public static void main(String[] args)
	{
		
		int A[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(" original array ");
		printOrig(A);
		System.out.println(" ");
		diagonal(A);
	}
	
	public static void printOrig(int A[][])
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				System.out.print(" "+A[i][j]);
			}
			
			System.out.println(" ");
		}
		
	}
	
	public static int[][] diagonal(int[][] A) {
    
		int arr[][] =new int[(A.length*2)-1][];
		
		int size=1;
        int index=0;
		int i=0,j=0,r=0,l=0;
		boolean maxSizeReached=false;
		
		//print(A);
		
		System.out.println(" ");
		while(index<(2*A.length)-1)
		{
			System.out.println(" index start "+index);
			System.out.println(" l start "+l);
			System.out.println(" r start "+r);
			System.out.println("size "+size);
			arr[index]=new int[size];
			int move=0;
			while(r>=0 && l<A.length)
			{
				System.out.println(" A[l][r] "+A[l][r]);
				arr[index][move]=A[l][r];
				move++;
				l++;
				r--;
				System.out.println(" l = "+l+" r = "+r);
			}
			
			if(maxSizeReached)
			{
				i++;
			}
			else{
				j++;
			}
			l=i;
			r=j;
			
			index++;
			
	
			size=maxSizeReached?--size:++size;
			if(size==A.length)
			{
				maxSizeReached=true;
			}
			System.out.println("maxSizeReached"+maxSizeReached);
			
			System.out.println(" ");
		}
		
		System.out.println(" printing new array ");
		print(arr);
		return arr;
	
	}
	
	static void print(int[][] A)
	{
		System.out.println(" A length "+A.length);
		System.out.println();
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
			//	System.out.println(" i "+i+" j "+j);
				System.out.print(" "+A[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
	}
}
