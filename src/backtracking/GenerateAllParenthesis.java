package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllParenthesis {

	public static void main(String[] args)
	{
		GenerateAllParenthesis obj=new GenerateAllParenthesis();
		obj.generateParenthesis(3);
		
	}
	
	public ArrayList<String> generateParenthesis(int a) {
	
		ArrayList<String> result=new ArrayList<>();
		dfs(result,"",a,a);
		System.out.println(" result "+result);
		return result;
	}
	
	public void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	    {
	    	System.out.println("simple return" + s);
	        return;
	    }
	    if(left==0&&right==0){
	    	System.out.println("result return" + s);
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	    	  System.out.println(" left "+s);
	        dfs(result, s+"(", left-1, right);
	      
	    }
	 
	    if(right>0){
	    	System.out.println(" right "+s);
	        dfs(result, s+")", left, right-1);
	        
	    }
	}
	
	

	
}
