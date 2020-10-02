package algo.dynamicprogramming;

public class Stairs {

	public static int climbStairs(int a) {
	
		if(a<=1)
		{
			return 1;
		}
		
		return climbStairs(a-1)+climbStairs(a-2);
	}
	
	public static void main(String[] args)
	{
		System.out.println(climbStairs(4));
		
	}
}
