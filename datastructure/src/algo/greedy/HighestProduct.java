package algo.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestProduct {

	public static void main(String[] args)
	{
		HighestProduct obj=new HighestProduct();
		
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(0, -1, 3, 100, -70, -50 ));
		obj.maxp3(a);
	}
	
	
	 public int maxp3(ArrayList<Integer> a) {
		 
		 int product=0;
		 System.out.println("original a "+a);
		 Collections.sort(a);
		 int size=a.size();
		 System.out.println(" a "+a);
		 product=Math.max(a.get(size-1)*a.get(size-2)*a.get(size-3),a.get(size-1)*a.get(0)*a.get(1));
		 
		
		 
		 System.out.println(" "+product);
		 return product;
		 
	    }
}
