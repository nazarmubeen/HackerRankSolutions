package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {

	public static void main(String[] args)
	{
		 ArrayList<Integer> prevSmaller=new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28));
		 prevSmaller=prevSmaller(prevSmaller);
		 System.out.println(prevSmaller);
	}
	
	
	
	  public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		  
		  
		  Stack<Integer> stack=new Stack<>();
		  stack.push(arr.get(0));
		  arr.set(0, -1);
		  for(int i=1;i<arr.size();i++)
		  {
			  int value=arr.get(i);
			  while (!stack.isEmpty() && stack.peek() >=value)
			  {
		            stack.pop();
			  }
		            // If all elements in S were greater than arr[i]
		        if (stack.isEmpty())
		        {	
		        	System.out.println("if");
		            arr.set(i, -1);    
		        }else  //Else print the nearest smaller element
		        {
		        	arr.set(i, stack.peek());
		        }
		        // Push this element
		        stack.push(value);
		        System.out.println(" element added "+stack.peek());
		  }
		  
		  
		  return arr;
	    }
	  
	 
}
