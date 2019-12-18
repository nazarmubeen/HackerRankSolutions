package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class DistinctNumbersInWindow {

	public static void main(String[] args)
	{
	DistinctNumbersInWindow obj=new DistinctNumbersInWindow();
	ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 4, 3));
	int k=3;
	obj.dNums(A,3);
	}
	
	
	 public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		 ArrayList<Integer> result = new ArrayList<>();
	        if(A == null || A.size() == 0 || B == 0) {
	            return result;
	        }
	        HashMap<Integer, Integer> hashMap = new HashMap<>();
	        int distinctCount = 0;
	        
	        for(int i =0; i < B; i++) {
	            if(!hashMap.containsKey(A.get(i))) {
	                hashMap.put(A.get(i), 1);
	                distinctCount++;
	            } else {
	                int temp = hashMap.get(A.get(i));
	                hashMap.put(A.get(i), temp+1);
	            }
	        }
	        
	        System.out.println("hasHmap "+hashMap);
	        result.add(distinctCount);
	        
	        for(int i = B; i < A.size(); i++) {
	            int previous = A.get(i-B);
	            if(hashMap.get(previous) == 1) {
	                distinctCount--;
	            }
	            hashMap.put(previous, hashMap.get(previous) -1);
	            System.out.println("hasHmap for i  "+i+" "+hashMap);
	            int current = A.get(i);
	            if(!hashMap.containsKey(current) || hashMap.get(current).intValue() == 0) {
	                hashMap.put(current, 1);
	                distinctCount++;
	            } else {
	                int temp = hashMap.get(A.get(i));
	                hashMap.put(A.get(i), temp+1);
	            }
	            result.add(distinctCount);
	        }
	        return result;
		 
	    }
	
	
}
