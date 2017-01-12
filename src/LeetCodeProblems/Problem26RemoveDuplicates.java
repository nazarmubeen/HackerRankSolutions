package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class Problem26RemoveDuplicates {

	public static void main(String[] args)
	{
		int[] arrnew={1,2,3,3,5,6,47,89,56,66,66,1,6,58,89};
		int[] arr={1,1};
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.print(" "+a);
		}
		System.out.println(removeDuplicates(arr));
		System.out.println("naive");
		System.out.println(removeDuplicatesNaive(arr));
	}

	
	 public static int removeDuplicates(int[] nums) {
	        
		 if(nums.length<2)
		 {
			 return nums.length;
		 }
		 
		 HashMap map=new HashMap<Integer,Integer>();
		 int j=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(!map.containsKey(nums[i]))
			 {
				map.put(nums[i],i) ;	
				nums[j]=nums[i];
				j++;
			 }	
		 }
		 
		System.out.println("length ="+(j+1));
				 
		 System.out.println(" ");
		
		 for(int a:nums)
			{
				System.out.print(" "+a);
			}
		 
		 
		 return j;
	    }
	 
	 public static int removeDuplicatesNaive(int[] A) {
			if (A.length < 2)
				return A.length;
		 
			int j = 0;
			int i = 1;
		 
			while (i < A.length) {
				if (A[i] == A[j]) {
					i++;
				} else {
					j++;
					A[j] = A[i];
					i++;
				}
			}
		 
			 System.out.println(" ");
				
			 for(int a:A)
				{
					System.out.print(" "+a);
				}
			 
			 
			 
	 
			return j + 1;
		}
}
