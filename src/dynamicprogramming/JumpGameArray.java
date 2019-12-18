package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JumpGameArray {

	public static void main(String[] args) {
		JumpGameArray obj = new JumpGameArray();
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2, 3, 1, 1, 4));
		System.out.println(obj.canJump(a));
	}

	public int canJump(ArrayList<Integer> a) {

		return canJumpO(a)==false?0:1;
	}

	public boolean canJumpO(ArrayList<Integer> a) {

	    if(a.size() <= 1)
	        return true;
	 
	    int max = a.get(0); //max stands for the largest index that can be reached.
	    System.out.println(" max "+max);
	    for(int i=0; i<a.size(); i++){
	    	System.out.println(" i "+i);
	        //if not enough to go to next
	        if(max <= i && a.get(i) == 0) 
	            return false;
	 
	        //update max    
	        if(i + a.get(i) > max){
	        	
	            max = i + a.get(i);
	            System.out.println(" max "+max);
	        }
	 
	        //max is enough to reach the end
	        if(max >= a.size()-1) 
	            return true;
	    }
	 
	    return false;    
	}

}
