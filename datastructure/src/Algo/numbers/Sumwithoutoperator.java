package Algo.numbers;

public class Sumwithoutoperator {

	public static void main(String[] args)
	{
		int a=22;
		int b=10;
		
		int c=12;
		
		
		System.out.println("final result "+sum(a,b));
		
		System.out.println(" negation of x "+~c+1);
	}
	
	static int sum(int x,int y)
	{
		
		while(y!=0)
		{
			int carry=x&y;
			System.out.println(" carry "+carry);
			
			x= x^y;
			
			System.out.println(" x = "+x);
			
			y=carry<<1;
			
			System.out.println(" y = "+y);
		}
		
		return x;
	}
}
