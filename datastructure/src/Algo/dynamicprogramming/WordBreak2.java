package Algo.dynamicprogramming;

import java.util.*;

public class WordBreak2 {

	public static void main(String[] args)
	{
		WordBreak2 obj=new WordBreak2();
		String a="catsanddog";
		ArrayList<String> b=new  ArrayList<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		obj.wordBreak(a, b);
	}
	public ArrayList<String> wordBreak(String s, ArrayList<String> dict) {
		//create an array of ArrayList<String>
			Set<String> foo = new HashSet<>(dict);
	        ArrayList<String> dp[] = new ArrayList[s.length()+1];
	        dp[0] = new ArrayList<String>();
	     
	        for(int i=0; i<s.length(); i++){
	            if( dp[i] == null ) 
	                continue; 
	     
	            for(String word:foo){
	                int len = word.length();
	                int end = i+len;
	                if(end > s.length()) 
	                    continue;
	     
	                if(s.substring(i,end).equals(word)){
	                    if(dp[end] == null){
	                        dp[end] = new ArrayList<String>();
	                    }
	                    dp[end].add(word);
	                }
	            }
	        }
	        System.out.println(" ");
	        for(int i=0;i<dp.length;i++)
	        {
	        	System.out.print(" "+dp[i]);
	        }
	       System.out.println(" "); 
	        ArrayList<String> result = new ArrayList<String>();
	       
	        if(dp[s.length()] == null) 
	            return result; 
	     
	        ArrayList<String> temp = new ArrayList<String>();
	        dfs(dp, s.length(), result, temp);
	        Collections.sort(result);
	        System.out.println("result "+result);
	        return result;
	    }
	    
	 
	private void dfs(List<String> dp[],int end,List<String> result, ArrayList<String> tmp){
		System.out.println(" end "+end);
		System.out.println("tmp "+tmp);
		System.out.println("result "+result);
	    if(end <= 0){
	        String path = tmp.get(tmp.size()-1);
	        for(int i=tmp.size()-2; i>=0; i--){
	            path += " " + tmp.get(i) ;
	            System.out.println(" ");
	        }
	 System.out.println("result path "+path);
	        result.add(path);
	        return;
	    }
	 
	    for(String str : dp[end]){
	        tmp.add(str);
	        dfs(dp, end-str.length(), result, tmp);
	        tmp.remove(tmp.size()-1);
	    }
	}
}
