package LeetCodeProblems;

/*
 * 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * 
 * 
 */

public class TwoSumProblem {

	 public static int[] twoSum(int[] nums, int target) {
	     int[] returnindex=new int[2]; 
	     int a;
	     for(int i=0;i<nums.length;i++)
	     {
	    	 a=target-nums[i];
	    	 for(int j=i+1;j<nums.length;j++)
	    	 {
	    		 if(nums[j]==a)
	    		 {
	    			 returnindex[0]=i;
	    			 returnindex[0]=j;
	    			 return returnindex;
	    		 }
	    	 }
	     }
	     
	     return returnindex;
		 
	    }
	
	public static void main(String[] args)
	{
		int[] nums={2,7,11,15};
		int target=9;
		int[] indexes=twoSum(nums,target);
		for(int a:indexes)
		{
			System.out.println(a);
		}
	}
	
}
