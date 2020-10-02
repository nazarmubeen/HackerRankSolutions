package algo.stack;

import java.util.Stack;

/*
 * 
Parse String and evaluate expression pseudo code:-

1) Remove spaces from string.
2) create two stacks one is to store operator and other to store digits.
3) initialize count variable to track balancing brackets.

4) Create a function to perform calculations:-

int calculate(int operand1,int operand2,Character operator)

Input parameters:- two operands , one operator

write code in if condition based on operator value like for multiply

		if(operator=='*' )
		{
			result=operand1*operand2;
			return result;
		}
		
similar for other operators.if operator is not there return 0 else return result.

return :- int result 

4) Create a function for returning sum for parsing string

int getResult(String parsestring)

input parameter:- string without spaces
output parameter:- result with total sum

there are four conditions that need to be check:-

condition 1:-
if character is ')' increment count by 1 and skip to net index.

condition 2:-
if character is digit push it to numberstack.

condition 3:-
if character is operator push it to operator stack.

condition 4:-
if character is '(' decrease count by one and perform calculate operation declared earlier 
which will take three parameters and also pop the same parameter from top of stack.

parameter 1 :- top element from numberstack 
parameter 2 :- top element from numberstack
parameter 3 :- top element from operatorstack

push result returned by function to numberstack.
push first operator(charAt(1)) just after the opening bracket into opertor stack.

check if count is zero that means no brackets left to calculate and string reached to first index.
	check if more than one number is there in number stack:-
		perform calculate functions until there is only one number in numberstack
return element of numberstack which is the result.

 */

public class PrefixCalculation {

	
	public static void main(String[] args)
	{
		
		String parsestring1="(+ 5 4 6)  ";
		String parsestring2="(* 2 (- 7 3) 4) ";
		String parsestring3="(+ 3 (* 5 2) (- 6 3)) ";
		
		//replaceAll("\\s","") to replace white spaces
		System.out.println("sum 1= "+getResult(parsestring1.replaceAll("\\s","")));
		System.out.println("sum 2= "+getResult(parsestring2.replaceAll("\\s","")));
		System.out.println("sum 3= "+getResult(parsestring3.replaceAll("\\s","")));
	}
		


	public static int getResult(String parsestring)
	{
		//Stack will hold operators
		Stack<Character> operatorstack =new Stack<Character>();
		//stack will hold numbers
		Stack<Integer> numberstack =new Stack<Integer>();
		
		//this will check for balancing brackets
		int count=0;
		//this variable returns sum
		int popresult = 0;

		//loop will start from end and will run till 0 position
		for(int i=parsestring.length()-1;i>=0;i--)
		{
			System.out.print(parsestring.charAt(i)+" ");
			char character=parsestring.charAt(i);
			
			//this will increment count and skip to next occurance
			if(character==')')
			{
				count++;
				
				continue;
			}
			
			//this will decrement the count and perform operation for closing brackets
			if(character=='(')
			{
				count--;	
				popresult=calculate(numberstack.pop(),numberstack.pop(),operatorstack.pop());
				numberstack.push(popresult);
			//	System.out.println("popresult="+popresult);
				operatorstack.push(parsestring.charAt(1));
				//if no brackets left to compute operation
				if(count==0)
				{
					while(numberstack.size()>1)
					{
						popresult=calculate(numberstack.pop(),numberstack.pop(),operatorstack.pop());
						numberstack.push(popresult);
						//System.out.println("popresult="+popresult);
						operatorstack.push(parsestring.charAt(1));
						
					}
					//return result since only one number is present in stack
					return popresult;
				}
				continue;
			}
			
			//if character is digit push it to number stack
			if(Character.isDigit(character))
			{
				numberstack.push(Character.getNumericValue(character) );
			}
			//else if character is not digit push it to operator stack
			else{
				operatorstack.push(character);
			}
			
	}
		return popresult;
		}

	

	static int calculate(int operand1,int operand2,Character operator)
	{
		int result=0;
		//System.out.println("");
		//System.out.print("operand1= "+operand1);
		//System.out.print(" operand2= "+operand2);
		//System.out.print(" operator= "+operator);
		if(operator=='/' && operand2!=0)
		{
			result=operand1/operand2;
			return result;
		}
		
		
		if(operator=='*' )
		{
			result=operand1*operand2;
			return result;
		}
		
		
		if(operator=='+' )
		{
			result=operand1+operand2;
			return result;
		}
		
		
		if(operator=='-' )
		{
			result=operand1-operand2;
			return result;
		}
		
		return result;
		
	}


	}