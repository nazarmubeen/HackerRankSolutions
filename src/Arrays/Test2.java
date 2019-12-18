package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args)
	{
		List<Integer> a= Arrays.asList(1,1,1,1);
				List<Integer> b=Arrays.asList(0,1,1,1);
				List<Integer> c=Arrays.asList(0,1,0,1);
				List<Integer> d=Arrays.asList(1,1,9,1);
				List<Integer> e=Arrays.asList(0,0,1,1);
				 List<List<Integer>> area=new ArrayList<>();
				 area.add(a);
				 area.add(b);
				 area.add(c);
				 area.add(d);
				 area.add(e);
			System.out.println(minimumDistance(5,4,area));
				 
	}
	
	static int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
	    {
	        // WRITE YOUR CODE HERE
	        
	        for(int i=0;i<numRows;i++)
	        {
	           int top = 0;
	           int left = 0;
	           int min;
	           
	        for(int j=0;j<numColumns;j++)
	        {
	        	
	        	int current=area.get(i).get(j);
	        	
	        	if(current>0)
	        	{
	        		System.out.println(" i "+i+"j "+j);
	        	if(i>0)
	        	{
	        	
	        		top=area.get(i-1).get(j);
	        		System.out.println(" top = "+top);
	        	}
	        	if(j>0)
	        	{
	        		left=area.get(i).get(j-1);
	        	}
	        	if(left>0 && top>0)
	        	min =Math.max(top, left);
	        	else if(left>0){
	        		min=left;
	        	}
	        	else{
	        		min=top;
	        	}
	        	if(current==9){
	        		System.out.println("current is "+current);
	        		return min;
	        	}
	        	area.get(i).set(j, current+min);
	        	}
	        	
	        	System.out.println("area " + area);
	        	
	        }
	            
	            
	        }
	        return 0;
	    }
}
