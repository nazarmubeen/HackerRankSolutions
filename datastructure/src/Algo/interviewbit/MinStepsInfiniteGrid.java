package Algo.interviewbit;

public class MinStepsInfiniteGrid {

	public static void main(String[] args)
	{
		int[] a={ 4, 8, -7, -5, -13, 9, -7, 8};
		int[] b={4, -15, -10, -3, -13, 12, 8, -8};
		
		System.out.println(coverPoints(a,b));
	}
	
    public static int coverPoints(int[] A, int[] B) {
        int x = 0;
        
        if(A.length!=B.length)
        {
        	return 0;
        }
        
        for(int i=0;i<A.length-1;i++)
        {
        	    int a =Math.abs(A[i+1]-A[i]);
        	    int b= Math.abs(B[i+1]-B[i]);
        	    
        	 //   System.out.println(" a = "+a);
        	 //   System.out.println(" b = "+b);
        	    
        		int diff=Math.max(Math.abs(a),Math.abs(b));
        	//	System.out.println("diff "+Math.abs(diff));
        		x=x+diff;
        	//	System.out.println(" x = "+x);

        }
        
        
    	return Math.abs(x);
    }
}
