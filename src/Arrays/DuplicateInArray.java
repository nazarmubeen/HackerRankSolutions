package Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args)
	{
		
	}
	
	 public static int repeatedNumber(final List<Integer> a) {
	    
		 Set<Integer> set=new HashSet<Integer>();
		 
		 for(int i:a)
		 {
			 if(set.contains(i))
			 {
				 return i;
			 }
			 else{
				 set.add(i);
			 }
		 }
		 
		 return -1;
		 
	 }
}
