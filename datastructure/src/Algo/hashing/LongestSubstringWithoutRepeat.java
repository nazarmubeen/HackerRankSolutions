package Algo.hashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args)
	{
		LongestSubstringWithoutRepeat obj=new LongestSubstringWithoutRepeat();
		obj.lengthOfLongestSubstring("dadbc");
	}
	
	public int lengthOfLongestSubstring(String a) {
		
		if(a.length()<1)
		{
			return 0;
		}
		
		if(a.length()==1)
		{
			return 1;
		}
		HashMap<Character,Boolean> map=null;
		
		int size = 0,count=0;
		int index=0;
		for(int i=index;i<a.length();i++)
		{
			System.out.println(" index "+index);
			System.out.println(" i "+i);
			if(map==null)
			{
				map=new HashMap<Character,Boolean>();
			}
			if(map.get(a.charAt(i))==null)
			{
				map.put(a.charAt(i), true);
				count++;
			}
			else{
				map=null;
				if(count>=size)
				{
					size=count;
					
				}
				count=0;
				index++;
				i=index-1;
			}
			
		}
		if(count>=size)
		{
			size=count;
			
		}
		System.out.println("size "+size);
		return size;
		
	}
	
	public int lengthOfLongestSubstring2(String a) {
	    HashMap<Character,Integer> x = new HashMap<Character,Integer>();
	    int answer = 0;
	    int curLen=0;
	    for(int i=0; i<a.length(); i++)
	    {
	        char temp = a.charAt(i);
	        if(x.get(temp) == null || x.get(temp)<i-curLen)
	        {
	            x.put(temp,i);
	            curLen++;
	        }
	        else
	        {
	            curLen = i-x.get(temp);
	            x.put(temp,i);
	        }
	        if(curLen > answer) answer = curLen;
	    }
	    return answer;
	}
}
