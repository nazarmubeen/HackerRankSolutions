package main.java.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {

	public static void main(String[] args)
	{
		WordBreak obj=new WordBreak();
		String a="myinterviewtrainer";
		ArrayList<String> b=new ArrayList<>(Arrays.asList("trainer", "my", "interview"));
		System.out.println(" final result "+obj.wordBreak(a, b));
		
	}
	public int wordBreak(String s, ArrayList<String> dictionary) {
	 boolean[] t = new boolean[s.length() + 1];
     t[0] = true;
     
     for(int i = 0; i < s.length(); i++){
         if(!t[i])
         {
        	 System.out.println(" t of "+i+" is "+!t[i]+" contniue ...");
             continue;
         }
         for(String word : dictionary){
        	 System.out.println(" word "+word);
             int length = word.length();
             int end = i + length;
             System.out.println("length "+length+"end "+end);
             if(end > s.length())
             {
            	 System.out.println("end > s.length() continue... ");
                 continue;
             }
             if(t[end])
                 {
                	 System.out.println("t[end] continue... "+t[end]);
                 continue;
                 }
             if(s.substring(i, end).equals(word))
             {
            	 System.out.println("s.substring(i, end).equals(word) "+t[end]);
                 t[end] = true;
             }
             
             
         }
     }
     return t[s.length()]==true?1:0;
	}
	
}
