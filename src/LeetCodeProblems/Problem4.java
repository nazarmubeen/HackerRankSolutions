package LeetCodeProblems;

/*
 
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5 
 
 */
public class Problem4 {
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
	        int[] nums3 = new int[nums1.length+nums2.length];
	        
	        if(nums1.length==0)
	        {
	        	nums3=nums2;
	        }
	        else if(nums2.length==0)
	        {
	        	nums3=nums1;
	        }
	       
	        
	        int i=0,j=0,k=0;       
	        
	        while(!(i>=nums1.length || j>=nums2.length ))
	        {
	        	System.out.println("in while");
	        	if(nums1[i]<nums2[j])
	        	{
	        		System.out.println("array 1 is less");
	        		nums3[k]=nums1[i];
	        		i++;
	        		k++;
	        		if(i>=nums1.length)
		        	{
		        		System.out.println("array 1 is over");
		        		while(j!=nums2.length)
		        		{
		        			nums3[k]=nums2[j];
		        			j++;
		        			k++;
		        		}
		        	}

	        	}
	        	else if(nums1[i]>nums2[j]){
	        		System.out.println("array 2 is less");
	        		nums3[k]=nums2[j];
	        		j++;
	        		k++;
	        		if(j>=nums2.length)
		        	{
		        		System.out.println("array 2 is over");
		        		while(i!=nums1.length)
		        		{
		        			nums3[k]=nums1[i];
		        			i++;
		        			k++;
		        		}
		        	}
	        	}	  
	        
	        }
	        
	        for(int x:nums3)
	      System.out.println(x);  
	      
	      int a=nums3.length;
	      System.out.println("a="+a);
	      float mid;
	      
	      
	    if(a%2==0 && a>1)
	      {
	    	  mid=(float) ((nums3[(a/2)-1]+nums3[(a/2)])/2.0);	  
	      }
	    
	      else{
	    	  mid=nums3[(a/2)];
	      }
	        
	        System.out.println("mid element is"+mid);
	        return mid;
	    }
	
	public static void main(String[] args)
	{
		int[] nums1={1,3,5,6,9};
		int[] nums2={2,4,7,8,10};
		findMedianSortedArrays(nums1,nums2);
		
	}

}
