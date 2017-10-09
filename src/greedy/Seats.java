package greedy;

import java.util.ArrayList;

public class Seats {

	public static void main(String[] args)
	{
		Seats obj=new Seats();
		String a="....x..xx...x..";
		obj.seats(a);
	}
	
	public int seats(String a) {
	    int ones = 0;
	    
	    for(int i = 0; i < a.length(); ++i) {
	        if(a.charAt(i) == 'x') ones++;
	    }
	    
	    int half = ones % 2 == 0 ? ones/2 : ones/2+1;
	    int mid = 0;
	    
	    for(int i = 0, c = 0; i < a.length(); ++i) {
	        if(a.charAt(i) == 'x') {
	            if(++c == half) {
	                mid = i;
	                break;
	            }
	        }
	    }
	    
	    int result = 0;

	    ones = 0;
	    int l = 0;
	    for(; l < mid; ++l) {
	        if(a.charAt(l) == '.') continue;
	        ones++;
	        int zeros = 0;
	        while(l+1 < mid &&  a.charAt(l+1) == '.') {
	            zeros++;
	            l++;
	        }
	        result = (result + (ones*zeros) % 10000003) % 10000003;
	    }
	    
	    ones = 0;
	    int r = a.length()-1;
	    for(; r >= mid; --r) {
	        if(a.charAt(r) == '.') continue;
	        ones++;
	        int zeros = 0;
	        while(r-1 >= mid && a.charAt(r-1) == '.') {
	            zeros++;
	            r--;
	        }
	        result = (result + (ones*zeros) % 10000003) % 10000003;
	    }
	    
	    return result % 10000003;
	}
}
