package interviewbit;

public class PascalTriangle {

	public static void main(String[] args)
	{
		
		generate(5);
		System.out.println(" KTH ROW ");
		getRow(2);
	}
	
	public static int[] getRow(int A) {

	    
		int[][] arr=new int[A][];
		
		for(int i=0;i<A;i++)
		{
			arr[i] =new int[i+1];
			for(int j=0;j<=i;j++)
			{
			   int diff=i-j;
			   
			   if(diff==0 || diff==i)
			   {
				   arr[i][j]=1;
			   }
			   else{
		//		   System.out.println("else "+" i = "+i+" j = "+j);
				 // System.out.println("arr[i-i][j-1] "+arr[i-i][j-1]+" arr[i-i][j] "+arr[i-i][j] );
				   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			//	   System.out.println(" "+arr[i][j]);
			   }
				
			}
			if(i==A-1)
			{
				System.out.println(" i ="+i);
				for(int k=0;k<arr[i].length;k++)
				{
					System.out.print(" "+arr[i][k]);
				}
				return arr[i];
			}
		//	System.out.println(" print at "+i);
			
		}
		
		print(arr);
		return arr[A-1];
	
	}
	
	public static int[][] generate(int A) {
    
	int[][] arr=new int[A][];
	
	for(int i=0;i<A;i++)
	{
		arr[i] =new int[i+1];
		for(int j=0;j<=i;j++)
		{
		   int diff=i-j;
		   
		   if(diff==0 || diff==i)
		   {
			   arr[i][j]=1;
		   }
		   else{
			   System.out.println("else "+" i = "+i+" j = "+j);
			 // System.out.println("arr[i-i][j-1] "+arr[i-i][j-1]+" arr[i-i][j] "+arr[i-i][j] );
			   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			   System.out.println(" "+arr[i][j]);
		   }
			
		}
		System.out.println(" print at "+i);
		
	}
	
	print(arr);
	return arr;
	
	
	}
	
	static void print(int[][] A)
	{
		System.out.println(" ");
		System.out.println();
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
			//	System.out.println(" i "+i+" j "+j);
				System.out.print(" "+A[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
	}
}
