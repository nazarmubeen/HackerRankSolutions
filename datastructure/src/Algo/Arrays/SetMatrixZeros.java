package Algo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1, 0 ,1));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(1, 1 ,1));
		ArrayList<Integer> c=new ArrayList<>(Arrays.asList(1, 0 ,1));
		
		ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
		results.add(a);
		results.add(b);
		results.add(c);
		setZeroes(results);
	}
	
	 public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    
		 boolean rows[]=new boolean[a.size()];
		 boolean[] columns=new boolean[a.get(0).size()];
		 for(int i=0;i<a.size();i++)
		 {
			 for(int j=0;j<a.get(i).size();j++)
			 {
				 if(a.get(i).get(j)==0)
				 {
					 rows[i]=true;
					 columns[j]=true;
				 }
			 }

		 }
		 
         System.out.println(" done");
	
         print(rows);
         print(columns);
		 
		 for(int i=0;i<a.size();i++)
		 {	 
				 if(rows[i]==true)
				 {
					 for(int j=0;j<a.get(i).size();j++)
					 {
					 a.get(i).set(j, 0);
					 }
				 }
		 }
		 System.out.println(a);
			
		 for(int j=0;j<a.get(0).size();j++)
		 {
			 if(columns[j]==true)
			 {
				 for(int k=0;k<a.size();k++)
				 {
				 a.get(k).set(j, 0);
				 }
			 }
		 }
		 
		 System.out.println(a);
	 }
		 
	 

	 static void print(boolean[] arr)
	 {
		 for(int i=0;i<arr.length;i++)
		 System.out.print(arr[i]);
		 System.out.println(" ");
	 }
}
