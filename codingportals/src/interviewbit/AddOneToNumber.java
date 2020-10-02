package interviewbit;

import java.util.Arrays;

public class AddOneToNumber {

	public static void main(String[] args)
	{
		int[] A={0 , 0 , 0 , 9};
		System.out.println(" ");
		print(plusOne(A));
		System.out.println(" ");
	
	}
	
	
	public static void print(int[] A)
	{
	for (int i=0;i<A.length;i++)
	System.out.print(" "+A[i]);
	}
	
	public static int[] plusOne(int[] A) {
    
		
		boolean allnine=false;
		int zeroindex=0;
		int ninthindex=A.length;
		boolean zero=true;
		boolean nine=true;
		int sum;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==0 && zero)
			{
				
				zeroindex++;
				System.out.println(" zero index at "+i+" "+zeroindex);
			}
			else{
				zero=false;
			}
			
			if(A[(A.length-i)-1]==9 && nine)
			{
				ninthindex--;
				System.out.println(" ninth index at "+i+" "+ninthindex);
			}
			else{
				nine=false;
			}
			
			if(!(nine || zero))
			{  
				System.out.println("bre");
				break;
			}
			System.out.println(" zero index "+zeroindex);
			System.out.println("ninth index "+ninthindex);
		}

		if(ninthindex==A.length)
		{
			A[A.length-1]=A[A.length-1]+1;
			System.out.println("return as it is");
			if(zeroindex==ninthindex)
			return Arrays.copyOfRange(A, zeroindex-1, A.length);  
			else{
				return Arrays.copyOfRange(A, zeroindex, A.length); 
			}
		}
		
		else{
		    if(ninthindex==0)
			{
			  int[] newA=new int[A.length+1];
			  newA[0]=1;
			  System.out.println("new A"+newA);
			  return newA;
			}
		    else{
			A[ninthindex-1]=A[ninthindex-1]+1;
		    }
			for(int j=ninthindex;j<A.length;j++)
			{
				A[j]=0;
			}
		}
	
		if(zeroindex==ninthindex)
			return Arrays.copyOfRange(A, zeroindex-1, A.length);  
			else{
				return Arrays.copyOfRange(A, zeroindex, A.length); 
			}
	}
}
