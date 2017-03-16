package dynamicprogramming;
/*
-8 5 7 4
3 7 -8 6
5 -8 9 6
6 8 3  2
 */

import java.util.ArrayList;

public class SubMatriceswithSumZeroGeneralApproach {

	 public static int solve(ArrayList<ArrayList<Integer>> A) {
		 int count=0; 
		 System.out.println("calculate");
		 int i=0;
		 int length=A.size()-1;
		 
		 //column submatrices sum
		
		 
		 for(int m =0;m<A.size();m++)
		 {
			int columnsum=0;
			for(int n=0;n<A.size();n++ )
			{
			
			 columnsum=columnsum+A.get(m).get(n);
			}
			 System.out.println("columnsum="+columnsum);
			 if(columnsum==0)
			 {
				 System.out.println("column matrix is zero");
				 count++;
			 }
		 }
		 
		 /*
		 -8 5 7 4
		 3 7 -8 6
		 5 -8 9 6
		 6 8 3  2
		  */
		 
		 
		 for(int m =0;m<A.size();m++)
		 {
			 
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 return count;
	    }
	 
	 public static void main(String[] args)
	 {
		 ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		 
		 ArrayList<Integer> row1=new ArrayList<Integer>(); 
		 ArrayList<Integer> row2=new ArrayList<Integer>(); 
		 ArrayList<Integer> row3=new ArrayList<Integer>(); 
		 
		 row1.add(-8);
		 row1.add(5);
		 row1.add(7);
		 row1.add(4);
		 row2.add(3);
		 row2.add(7);
		 row2.add(-8);
		 row2.add(6);
		 row3.add(5);
		 row3.add(-8);
		 row3.add(9);
		 row3.add(6);
		 a.add(row1);
		 a.add(row2);
		 a.add(row3);
		 solve(a);
}
	 
}
