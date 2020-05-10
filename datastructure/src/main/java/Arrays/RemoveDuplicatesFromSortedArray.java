package main.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args)
	{
		int[] arr={1,2,2,2,3,3,3,4,4,4,4,4,6,8,9,10};
		arr=removeDuplicates(arr);
		System.out.println(" ");
		print(arr);
		System.out.println(" removing from arraylist");
		ArrayList<Integer> arrnewlist=new ArrayList<Integer>(Arrays.asList(5000,5000,5000));
		
		System.out.println(arrnewlist);
		System.out.println(" size = "+arrnewlist.size());
		int size=removeDuplicates(arrnewlist);

	}
	
	
	
	public static int removeDuplicates(ArrayList<Integer> a) {
	
		  if (a.size() < 2) return a.size();
		    
		    int prev = a.get(a.size() - 1);
		    for (int i = a.size() - 2; i >= 0; i--) {
		        if (a.get(i) == prev) {
		            a.remove(i);
		        }
		        else {
		            prev = a.get(i);
		        }
		    }
		    
		    return a.size();
		}
	
	
	
	static int[] removeDuplicates(int[] arr)
	{
		int randomnumber=arr[0]-1;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j]){
					i++;
				}
				else{
				    while(arr[j]==arr[i])
				    {
				    	arr[j]=randomnumber;
				    	j++;
				    }
				    i=j;
					
				}
			}
		}
		
		Arrays.sort(arr);
		int k=0;
		while(arr[k]==randomnumber)
		{
			k++;
		}
		print(arr);
		
		for(int i=0;i<arr.length-8;i++)
		{
			arr[i]=arr[i+8];
		}
		
		
		return arr;
	}
	
	static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	
	
}
