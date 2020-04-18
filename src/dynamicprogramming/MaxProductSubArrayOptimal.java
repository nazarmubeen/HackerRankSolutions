package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

import Utils.ArrayUtilFunc;

public class MaxProductSubArrayOptimal {
	public static int maxProduct(final List<Integer> a) {
		  	int[] max = new int[a.size()];
		    int[] min = new int[a.size()];
		 
		    max[0] = min[0] = a.get(0);
		    int result = a.get(0);
		 
		    for(int i=1; i<a.size(); i++){
		        if(a.get(i)>0){
		            max[i]=Math.max(a.get(i), max[i-1]*a.get(i));
		            min[i]=Math.min(a.get(i), min[i-1]*a.get(i));
		           
		        }else{
		            max[i]=Math.max(a.get(i), min[i-1]*a.get(i));
		            min[i]=Math.min(a.get(i), max[i-1]*a.get(i));
		        }
		        
		        ArrayUtilFunc.printArray(max);
		        ArrayUtilFunc.printArray(min);
	            
	            System.out.println(" ");
		        result = Math.max(result, max[i]);
		    }
		 
		    return result;
		
	}
	
	public static void main(String[] args)
	{
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(-2);
		a.add(4);
		System.out.println(maxProduct(a));
	
		
	}
}
