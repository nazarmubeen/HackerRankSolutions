package treeproblems_interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Prefix {
	
	
	public static void main(String[] args)
	{
		Prefix obj=new Prefix();
		ArrayList<String> a=new ArrayList<>(Arrays.asList("zebra", "dog", "duck", "dove"));
		obj.prefix(a);
	}
	
	
	
	
	public ArrayList<String> prefix(ArrayList<String> a) {
	  ArrayList<String> result = new ArrayList<String>();
        if(a == null || a.size() == 0) return result;
         
        Map<String, String> validPreFix = new HashMap<String, String>();
        HashSet<String> usedPreFix = new HashSet<String>();
         
        for(String str:a){
        	
        	System.out.println(" string is "+str);
        	
            for(int i = 1; i<=str.length(); i++){
            	System.out.println(" current substring is "+str.substring(0,i));
                String prefix = str.substring(0,i);
                if(!usedPreFix.contains(prefix)){
                    validPreFix.put(prefix, str);
                    usedPreFix.add(prefix);
                }else{
                	System.out.println("valid prefix before "+validPreFix);
                	System.out.println("remove prefix "+prefix);
                    validPreFix.remove(prefix);
                    System.out.println("valid prefix after "+validPreFix);
                }
            }
            System.out.println(" used Prefix "+usedPreFix);
            System.out.println("valid prefix"+validPreFix);
        }
         
        Map<String, String> shortestPrefix = new HashMap<String, String>();
        for(String key:validPreFix.keySet()){
            String val = validPreFix.get(key);
            if(shortestPrefix.containsKey(val)){
                String temp = shortestPrefix.get(val);
                if(temp.length()>key.length()){
                    shortestPrefix.put(val, key);
                }
            }else{
                shortestPrefix.put(val, key);
            }
        }
         
        for(String str:a){
            result.add(shortestPrefix.get(str));
        }
        return result;
	}
}

