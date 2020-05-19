package Algo.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MinStack {

	Stack<Integer> stack=new Stack<>();
	Stack<Integer> minstack=new Stack<Integer>();
	
	public static void main(String[] args)
	{
		MinStack stack=new MinStack();
		
		int a = 0;
	//	ArrayList<String> arr=new ArrayList<>(Arrays.asList("19" ,"P" ,"10", "P", "9", "g" ,"P","8","g" ,"P" ,"7" ,"g", "P" ,"6" ,"g" ,"p" ,"g", "p", "g" ,"p","g", "p" ,"g", "p", "g"));
		ArrayList<String> arr=new ArrayList<>(Arrays.asList("913", "p", "P", "644643544", "g" ,"t" ,"t", "p","t", "p" ,"P"));
		System.out.println(" arr "+arr);
		for(int i=0;i<arr.size();i++)
		{
			String num=arr.get(i);
			if(isInteger(num))
			{
				a=Integer.valueOf(num);
				stack.push(a);
			}
			else{
				if(num.equals("P"))
				{
				//	System.out.print(" push "+ a);
					
				}
				else if(num.equals("p"))
				{//System.out.print(" POP ");
					stack.pop();
				}
				else if(num.equals("t"))
				{
				//System.out.print(" TOP ");
					System.out.print(stack.top()+" ");
				}
				else if(num.equals("g"))
				{
				//	System.out.print(" MIN ");
					System.out.print(stack.getMin()+" ");
				}
			}
			
		}
		
		
		
		
	}
	static boolean isInteger(String num)
	{
	//	System.out.println("checking integer "+num);
		try{
		if(Integer.valueOf(num) != null)
		{
			return true;
		}
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
		
	}
	
	  public void push(int x) {   
		 System.out.println("pushing "+x);
		  stack.push(x);
		  if(minstack.isEmpty() || minstack.peek()>x)
		  {
			  minstack.push(x);
		  }
		//  System.out.println(stack.peek());
	    }

	    public void pop() {
	    	 if(!stack.isEmpty())
	    	 {
	 	     int a=stack.peek();
	    	if(a==minstack.peek())
	    	{
	    		minstack.pop();
	    	}
	    	 }
	    	if(!stack.isEmpty())
	        stack.pop();
	    	
	    }

	    public int top() {
	        if(!stack.isEmpty())
	    	return stack.peek();
	        
	    	return -1;
	    }

	    public int getMin() {
	    	if(!minstack.isEmpty())
	    	{
	    		return minstack.peek();
	    	}
	    	return -1;
	    }
}
