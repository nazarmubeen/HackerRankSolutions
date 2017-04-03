package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {

	public static void main(String[] args)
	{
		generate(5);
	}
	
	 public  static List<List<Integer>> generate(int numRows) {
		int rows=numRows;
		List<List<Integer>> biglist=new ArrayList();
		
		 for(int i=0;i<rows;i++)
		 {
			 int number=1;
			 List<Integer> list=new ArrayList();
			 for(int j=0;j<=i;j++)
			 {
				 list.add(number);
				 number=number *(i-j)/(j+1);
				 
				 
			 }
			 biglist.add(list);
		 }
		 
		 System.out.println(biglist);
		 System.out.println(" ");
		 return biglist;
	        
		 
	    }
}
