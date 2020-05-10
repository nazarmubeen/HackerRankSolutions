package main.java.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNotRepeatingCharacter {

	public static void main(String[] args)
	{
		String s="bcccmccccb";//abacabad
		
		System.out.println(firstNotRepeatingCharacter(s));
	}
	
	static char firstNotRepeatingCharacter(String s) {
		HashMap<Character,Boolean> map=new LinkedHashMap<Character,Boolean>();
		for( int i =0 ;i<s.length();i++)
		{
			char cur=s.charAt(i);
			if(map.containsKey(cur))
			{
				map.put(cur, false);
			}
			else{
			map.put(cur,true);
			}
		}
		
		for(Character k:map.keySet()){
			
			if(map.get(k)==true)
			{
				return k;
			}
		}

		return ' ';

	}
}
