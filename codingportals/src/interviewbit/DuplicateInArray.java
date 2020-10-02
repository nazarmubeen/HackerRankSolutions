package interviewbit;


import java.util.HashSet;
import java.util.List;

public class DuplicateInArray {

	public static void main(String[] args)
	{
		
	}
	
	public int repeatedNumber(final List<Integer> a) {
	
	HashSet<Integer> map=new HashSet<Integer>();
	
	for(int i:a)
	{
		if(map.contains(i))
		{
			return i;
		}
		else{
			map.add(i);
		}
	}
	
	return -1;
	
	
		
	}
	
}
