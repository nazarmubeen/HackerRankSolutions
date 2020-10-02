package Algo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class NumRange {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(10, 5, 1, 0, 2));
		int n=numRange(a,6,8);
		System.out.println(" "+n);
	}
	
	public static int numRange(ArrayList<Integer> a, int b, int c) {
		
		int count=0,i=0;
		while(i<a.size())
		{
			int tempsum=0;
			
			int j=i;
			while(j<a.size()){	
				tempsum=tempsum+a.get(j);
				j++;
				if((tempsum>c)){
					tempsum=0;
					break;
				}
				
				System.out.println("tempsum"+tempsum);
				if(tempsum>=b && tempsum<=c)
				{
					
					count++;
				}
			}
			i++;
		}
		
		
		return count;
	}
}
