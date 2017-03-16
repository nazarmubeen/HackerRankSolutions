package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class BuySellStocks {

	
	public static int maxProfit(final List<Integer> a) {
		
		if(a.size()<=0)
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
