package stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args)
	{
		String x=reverseString("abcd");
		System.out.println(" x "+x);
	}
	
public static String reverseString(String a) {
	    
	    Stack<Character> ch=new Stack<>();
	    char[] arr=a.toCharArray();
	    for(char i :arr)
	    {
	    	ch.push(i);
	    }
	    
	    int j=0;
	    
	    while(!ch.isEmpty())
	    {
	    	arr[j]=ch.pop();
	        j++;
	    }
	    
	    a=String.valueOf(arr);
	    return a;
	  
	}
}
