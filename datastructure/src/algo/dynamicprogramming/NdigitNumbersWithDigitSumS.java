package algo.dynamicprogramming;

public class NdigitNumbersWithDigitSumS {
	// A lookup table used for memoization
    static int lookup[][] = new int[101][501];
	public static void main(String[] args)
	{
		NdigitNumbersWithDigitSumS obj=new NdigitNumbersWithDigitSumS();
		int A=75;
		int B=22;
		System.out.println("result"+obj.solve(A,B));
	}
	
	// Memoizatiob based implementation of recursive
    // function
    static int countRec(int n, int sum)
    {
        // Base case
        if (n == 0)
           return sum == 0 ? 1 : 0;
      
        // If this subproblem is already evaluated,
        // return the evaluated value
        if (lookup[n][sum] != -1)
           return lookup[n][sum];
      
        // Initialize answer
        int ans = 0;
      
        // Traverse through every digit and
        // recursively count numbers beginning
        // with it
        for (int i=0; i<10; i++)
           if (sum-i >= 0)
              ans += countRec(n-1, sum-i);
      
        return lookup[n][sum] = ans;
    }
	 
 // This is mainly a wrapper over countRec. It
    // explicitly handles leading digit and calls
    // countRec() for remaining n.
    static int solve(int n, int sum)
    {
        // Initialize all entries of lookup table
        for(int i = 0;i<=100;++i){
            for(int j=0;j<=500;++j){
            	//System.out.println("i "+i+" j "+j);
                lookup[i][j] = -1;
            }
        }
      
        // Initialize final answer
        int ans = 0;
      
        // Traverse through every digit from 1 to
        // 9 and count numbers beginning with it
        for (int i = 1; i <= 9; i++)
          if (sum-i >= 0)
             ans += countRec(n-1, sum-i);
        ans=ans%1000000007;
        return ans;
    }
	
}
