package algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> b=new ArrayList<Integer>(Arrays.asList(6,7,8,9,10));
		ArrayList<Integer> c=new ArrayList<Integer>(Arrays.asList(11,12,13,14,15));
		ArrayList<Integer> d=new ArrayList<Integer>(Arrays.asList(16,17,18,19,20));
		ArrayList<Integer> e=new ArrayList<Integer>(Arrays.asList(21,22,23,24,25));
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		result.add(a);
		result.add(b);
		result.add(c);
		result.add(d);
		result.add(e);
		rotate(result);
		
	}
	
	public static void rotate(ArrayList<ArrayList<Integer>> a) { 
        int S = a.size() - 1;
    
    for(int i = 0 ; i < a.size() / 2 ; i++){
        
        
        for(int j = i; j < S - i; ++j){
            
            int temp1 = a.get(i).get(j);
            int temp2 = a.get(S-j).get(i);
            int temp3 = a.get(S-i).get(S-j);
            int temp4 = a.get(j).get(S-i);
            
            
            // swap
            a.get(i).set(j,temp2);
 
            a.get(S-j).set(i,temp3);
            a.get(S-i).set(S-j,temp4);
            a.get(j).set(S-i,temp1);
        //    System.out.println(" j = "+j);
          //  System.out.println("a "+a);
        }
        }
    }
	
	public static void rotate2(ArrayList<ArrayList<Integer>> a) { 
		int S = a.size() - 1;
    
    for(int i = 0 ; i < a.size() / 2 ; i++){
        
        
        for(int j = i; j < S - i; ++j){
            
            int temp1 = a.get(i).get(j);
            int temp2 = a.get(S-j).get(i);
            int temp3 = a.get(S-i).get(S-j);
            int temp4 = a.get(j).get(S-i);
            
            
            // swap
            a.get(i).set(j,temp2);
            a.get(S-j).set(i,temp3);
            a.get(S-i).set(S-j,temp4);
            a.get(j).set(S-i,temp1);
            System.out.println(" j = "+j);
            System.out.println("a "+a);
        }
        }
	}
}


