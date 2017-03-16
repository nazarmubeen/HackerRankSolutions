package LeetCodeProblems;

public class Problem7 {

	public static void main(String[] args)
	{
		int a=1;
		
		reverse(a);
		
	}
	
	public static int reverse(int x) {
	  
		
		int r;
		int s=0,result=s;
		
		while(x!=0)
		{
		r=x%10;
		s=s*10+r;
		System.out.println(s);
		if((s/10)-r!=result)
			return 0;
		result=s;
		}
		System.out.println("reverse number"+s);
		
		
		
		return result;
  }
	
}
