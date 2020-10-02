package algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example :

Input : [1 2]
Return :  1
*/

public class BuySellStocks {

	
	public static int maxProfit(final List<Integer> a) {
		
		if(a.size()<=1)
			return 0;
		
		int minelement=a.get(0);
		int maxdiff=a.get(1)-a.get(0);
		
		for(int i:a)
		{
			if(i-minelement>maxdiff)
				maxdiff=(i-minelement);
			
			if(i<minelement)
				minelement=i;
		}
		
		
		return maxdiff;
	}
	
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(7);
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(6);
		a.add(4);
		System.out.println(maxProfit(a));
		
	}
}
