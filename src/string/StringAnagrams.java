package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StringAnagrams {

	//Function to count number of elements to be deleted for making 
	//any two strings anagrams
	public static  int makeAnagram2(char[] a,char[] b)
	{
		int c=0;
		
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();

		 for (char ch : a)
	        {
	            if(charCountMap.containsKey(ch))
	            {
	            	int x=charCountMap.get(ch);
	            	x=x+1;
	                charCountMap.put(ch, x);
	            }
	            else
	            {
	                charCountMap.put(ch, 1);
	            }
	        }
		 
		
		 for (char ch : b)
	        {
	            if(charCountMap.containsKey(ch))
	            {
	            	int x=charCountMap.get(ch);
	            	x=x-1;
	                charCountMap.put(ch, x);
	            }
	            else {
	            	c=c+1;
	               
	            }
	        }
             Iterator it=charCountMap.entrySet().iterator();
		 
		  while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		       int count=(Integer) pair.getValue();
		       if(count<0)
		       {
		    	   c=c-count;
		       }
		       else{
		    	   c=c+count;
		       }
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		return c;
	}
    
    public static int numberNeeded(String one, String two) {
      	if(one.length()>two.length())
		{
			return makeAnagram2(one.toCharArray(),two.toCharArray());
		}
		else{
		return makeAnagram2(two.toCharArray(),one.toCharArray());
	}
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
