package main.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AssignMiceToHoles {

	public static void main(String[] args)
	{
		AssignMiceToHoles obj=new AssignMiceToHoles();
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList( -10, -79, -79, 67, 93, -85, -28, -94));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(-2, 9, 69, 25, -31, 23, 50, 78));
		obj.mice(a, b);
	}
	
	 public int mice(ArrayList<Integer> a, ArrayList<Integer> b) {
	 int count=0;
	 
	 Collections.sort(a);
	 Collections.sort(b);
	 
	 System.out.println(" a "+a);
	 System.out.println("b "+b);
	 
	 
	 for(int i=0;i<a.size();i++)
	 {
		 int diff=Math.abs(a.get(i)-b.get(i));
		 if(diff>count)
		 {
			 count=diff;
		 }
	 }
	 System.out.println(" count "+count);
	 
	 
	 
	 return count;
		 
	 }
}
