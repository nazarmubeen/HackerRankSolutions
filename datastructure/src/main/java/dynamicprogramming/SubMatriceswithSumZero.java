package main.java.dynamicprogramming;

import java.util.ArrayList;

/*
 * 
 * 
Given a 2D matrix, find the number non-empty sub matrices,
 such that the sum of the elements inside the sub matrix is equal to 0. 
 (note: elements might be negative).

Example:
Input
-8 5 7
3 7 -8
5 -8 9
Output
2

Explanation
-8 5 7
3 7 -8
5 -8 9

-8 5 7
3 7 -8
5 -8 9
 */
public class SubMatriceswithSumZero {

	 public static int solve(ArrayList<ArrayList<Integer>> A) {
		 int count=0; 
		 System.out.println("calculate");
		 int i=0;
		 int length=A.size()-1;
		 
		 //column submatrices sum
		
		 
		 for(int k=0;k<A.size();k++)
		 {
			 int columnsum=0;
			 columnsum=A.get(k).get(0)+A.get(k).get(1)+A.get(k).get(2);
			 System.out.println("columnsum="+columnsum);
			 if(columnsum==0)
			 {
				 System.out.println("column matrix is zero");
				 count++;
			 }
		 }
		 
		 
		 
		 
		 //row submatrices sum
		 
		 int sold=0,snew=0,told=0,tnew=0;
		 int cold=0,cnew=0;
		 while(i!=A.size())
		 {
			 
			 //columnsum to calculate bottom submatrices sum
			 cnew=cold+A.get(0).get(i);
			 System.out.println("column sum in first="+cnew);
			 
			 //to hold first two rows sum
			 tnew=A.get(0).get(i)+A.get(1).get(i)+told;
			 System.out.println("tnew="+tnew);
			 
			 if(tnew==0)
			 {
				 System.out.println("sum is zero");
				 count++;
			 }
			 
			 //to hold first three rows submatrices sum
			 snew=(tnew-told)+A.get(2).get(i);
			 System.out.println("snew="+snew);
			 if(snew==0)
			 {
				 System.out.println("sum is zero");
				 count++;
			 }
			 
			 snew=sold+(tnew-told)+A.get(2).get(i);
			 System.out.println("snew="+snew);
			 if(snew==0)
			 {
				 System.out.println("sum is zero");
					 count++;
			 }
			 
			 int belowsubmatrix=(snew-cnew);
			 System.out.println("belowsubmatrix sum="+belowsubmatrix);
			 if(belowsubmatrix==0)
			 {
				 System.out.println("sum is zero");
				 count++;
			 }
			 
			 sold=snew;
			 told=tnew;
			 cold=cnew;
			 i++;
			 
		 }
		 System.out.println("count after row is ="+count);
		
		 //column
		 
		 
		 
		 
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
		 row2.add(3);
		 row2.add(7);
		 row2.add(-8);
		 row3.add(5);
		 row3.add(-8);
		 row3.add(9);
		 
		 a.add(row1);
		 a.add(row2);
		 a.add(row3);
		 solve(a);
	 }
	 
}
