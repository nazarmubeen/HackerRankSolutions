package interviewbit;

public class RepeatAndMissingArray {

	public static void main(String[] args)
	{
		int[] a={3,1,2,5,3};
		repeatedNumber(a);
		
	}
	
	 // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(final int[] A) {
    	
    	int size=A.length;
    	Long s1=0L,s2=0L;
    	Long e1=0L,e2=0L;
    	  for(int i=0;i<A.length;i++)
    	 {
    		 s1=s1+A[i];
    		 s2=s2+A[i]*A[i];
    		 System.out.println(" I = "+i+" "+s1+" "+s2);
    	 }
    	
    	 e1=(long) ((size*(size+1))/2);
    	 e2=(long) ((size)*(size+1)*(2*size+1))/6;
    	 
    	// System.out.println(" e1 "+e1+" e2 "+e2);
    	 
    	 
    	 long c2=e2-s2;
    	 long c1=e1-s1;
    	// System.out.println("c1 "+c1+"c2 "+c2);
    	 
    	 int m=(int) ((c2/c1+c1)/2);
    	 int d=(int) (m-c1);
    	 //System.out.println(" m = "+m+"d= "+d);
    	 
    	return new int[]{d,m};
    }
}
