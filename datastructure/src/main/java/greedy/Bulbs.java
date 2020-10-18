package main.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulbs {

	public static void main(String[] args)
	{
		Bulbs obj=new Bulbs();
		ArrayList<Integer> alist=new ArrayList<>(Arrays.asList(0 ,1, 0, 1));
		obj.bulbs(alist);
	}
	
	 public int bulbs(ArrayList<Integer> a) {
		 
		 int count=0;
		 
		 for(int i=0;i<a.size();i++)
		 {
			 if(count%2!=0)
			 {
				 a.set(i, a.get(i)==1?0:1);
				 
			 }
			 if(a.get(i)==1)
			 {
				 continue;
			 }
			 a.set(i,1);
			 count++;
			 System.out.println(" a "+a);
			 
		 }
		 System.out.println(" count "+count);
		 return count;
	    }
	
	
}
