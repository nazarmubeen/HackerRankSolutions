package main.java.Arrays;


/* Leet Code Problem 1
 * 
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class TwoSum {

	public static void main(String[] args)
	{
		int[] arr={2,7,11,15};
		int target=17;
		int[] x=twoSum(arr,target);
		System.out.println("first at "+x[0]+" second at "+x[1]);
		
	}
	
	 public static int[] twoSum(int[] nums, int target) {

		 for(int i=0;i<nums.length;i++)
		 { 
			 for(int j=i+1;j<nums.length;j++)
			 {
				 if(nums[j]==(target-nums[i]))
				 {
					 int[] x={i,j};
					 return x;
				 }
			 }
			 
		 }
	 return nums;
	    }
}
