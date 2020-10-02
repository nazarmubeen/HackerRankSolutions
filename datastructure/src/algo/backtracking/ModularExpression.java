package algo.backtracking;

public class ModularExpression {

	public static void main(String[] args)
	{
	//	System.out.println(-1%20);
		System.out.println(Mod(-1,1,20));
	}
	

	    
		public static int Mod(int a, int b, int c) {
			  
		    if(a == 0){
		        return 0;
		    }
		    if(b == 0){
		        return 1;
		    }
		    long  y = 0;        
	        if (b % 2 == 0) {
	            y = Mod(a, b/2, c);
	            y = (y * y) % c;
	        } else {
	            y = a % c;
	            y = (y * Mod(a, b - 1, c)) % c;
	        }
	                // Incase y is negative. 
	        return (int)((y + c) % c);
		    
		}
}
