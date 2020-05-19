package Algo.interviewbit;

public class SpiralOrderMatrix2 {

	public static void main(String[] args)
	{
		generateMatrix(2);
	}
	
	public static int[][] generateMatrix(int A) {
    
		int[][] arr=new int[A][A];
		int initial=1;
		int size=A; int i=0,j=-1;
		int k=0;
		
		while(size>0)
		{
			System.out.println(" size initial "+size);
			System.out.println(" initial "+initial);
			j++;
			print(arr);
			for(k=0;k<size;k++)
			{
				arr[i][j]=initial;
				j++;
				initial++;
			}
			size--;
			j--;
			print(arr);
			for(k=0;k<size;k++)
			{
				i++;
				arr[i][j]=initial;
				initial++;	
			}
			print(arr);
			for(k=0;k<size;k++)
			{
				j--;
				arr[i][j]=initial;
				initial++;
			}
			size--;
			print(arr);
			System.out.println(" i = "+i+"j ="+j);
			for(k=0;k<size;k++)
			{
				i--;
				arr[i][j]=initial;
				initial++;
			}
			
			print(arr);
			System.out.println(" size final = "+size);
		}
	return arr;
	
	}
	
	static void print(int[][] A)
	{
		System.out.println(" print array ");
		for(int i=0;i<A.length;i++)
		{
			for (int j=0;j<A.length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("******");
		
	}
}
