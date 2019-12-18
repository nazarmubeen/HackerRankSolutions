package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumRectangleInBinaryMatrix {

	public static void main(String[] args)
	{
		MaximumRectangleInBinaryMatrix obj=new MaximumRectangleInBinaryMatrix();
		ArrayList<Integer> one=new ArrayList<Integer>(Arrays.asList(1, 1, 1));
		ArrayList<Integer> two=new ArrayList<Integer>(Arrays.asList( 0, 1, 1));
		ArrayList<Integer> three=new ArrayList<Integer>(Arrays.asList(1, 0, 0));

		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		a.add(one);
		a.add(two);
		a.add(three);
		System.out.println(obj.maximalRectangle(a));
	}
	public int maximalRectangle(ArrayList<ArrayList<Integer>> a) {
		 if (a.size() == 0) return 0;
		    int[][] dp = new int[a.size()][a.get(0).size()];
		    int maxRec = 0;
	        for (int i = 0; i < dp.length; i++) {
	        	System.out.println(" ");
	            for (int j = 0; j < dp[0].length; j++) {
	            	
	                int num = a.get(i).get(j);
	               System.out.println("i = "+i+" j= "+j);
	                if (j == 0) 
	                dp[i][j] = num == 1 ? 1 : 0;
	                else 
	                dp[i][j] = num == 1 ? dp[i][j - 1] + 1 : 0;
	       //         System.out.println("num "+num+" dp[i][j] "+dp[i][j]);
	                int row = i;
	                int width = dp[i][j];
	             //   System.out.println("row "+row+" width "+width);
	                
	                while (row >= 0 && dp[row][j] > 0) {
	                	
	                    width = Math.min(width, dp[row][j]);
	                    System.out.println("width = "+width);
	                    maxRec = Math.max(maxRec, width * (i - row + 1));
	                    System.out.println("maxRec = "+maxRec);
	                    row--;
	                    System.out.println(" row now "+row);
	                    System.out.println(" ");
	                }
	            }
	        }
	        System.out.println(" ");
	        print(dp);
	        return maxRec;
		
	}
	void print(int[][] dp)
	{
		for(int i=0;i<dp.length;i++)
		{
			System.out.println(" ");
			for(int j=0;j<dp.length;j++)
			{
				System.out.print(" "+dp[i][j]);
			}
		}
	}
	 
}