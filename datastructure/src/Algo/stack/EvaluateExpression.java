package Algo.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args)
	{
		
		ArrayList<String> arr=new ArrayList<>(Arrays.asList("4", "13", "5", "/", "+"));
		
		System.out.println(arr);
		
		int result=evalRPN(arr);
		System.out.println(result);
		
	}
	
	public static int evalRPN(ArrayList<String> a) {
		
	
		
	   Stack<Integer> stack=new Stack<>();
	   for(String num:a)
	   {
		   System.out.println(" num "+num);
		   if(isInteger(num))
		   {
			   stack.push(Integer.valueOf(num));
		   }
		   else{
			   int first=stack.pop();
			   int second=stack.pop();   
			   stack.push(calculateSum(first,second,num));
		   }
		   
		   
		   
	   }
		
		return stack.peek();
		
	}
	
	static boolean isInteger(String num)
	{
		System.out.println("checking integer "+num);
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
	
	static int calculateSum(int a, int b,String symbol)
	{
		System.out.println(" non integer symbol "+symbol);
		int result=0;
		
		if(symbol.equals("*"))
		{
			result= a*b;
		}
		else if(symbol.equals("+"))
		{
			result=a+b;
		}
		else if(symbol.equals("/"))
		{
			result=b/a;
		}
		else if(symbol.equals("-"))
		{
			result=b-a;
		}
		else if(symbol.equals("%"))
		{
			result=a%b;
		}
		
		System.out.println(" result of calculation ="+result);
		return result;
		
		
	}
}
