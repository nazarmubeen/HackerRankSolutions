package leetcodemaychallenge.topquestion.dp;

public class DPProblems {

    public static void main(String[] args){

    }

    //https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/569/
    public int climbStairs(int n) {

        int[] arr=new int[n];

        return ways(n,arr);
    }

    int ways (int n,int[] arr){


        if(n == 0 || n==1)
            return 1;

        if(arr[n-1]==0){
            arr[n-1]=ways(n-1,arr);
        }

        if(arr[n-2]==0){
            arr[n-2]=ways(n-2,arr);
        }


        return arr[n-2]+arr[n-1];

    }

    //https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/566/
    public int maxSubArray(int[] nums) {

        int currentSum=nums[0];
        int maxSum=nums[0];


        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i], currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);

        }
        return maxSum;
    }


    //https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/572/
    public int maxProfit(int[] prices) {

        if(prices.length<=1){
            return 0;
        }

        int currentProfit=0;
        int buy=prices[0];

        for(int i=1;i<prices.length;i++){


            if(prices[i]-buy>currentProfit){
                currentProfit=prices[i]-buy;
            }

            if(prices[i]<buy){
                buy=prices[i];
            }



        }

        return currentProfit;



    }
}
