package leetcodemaychallenge.topquestion.dp;

import java.util.Stack;

public class DPProblems {

    public static void main(String[] args) {

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

        for(int i = 1; i<prices.length; i++){


            if(prices[i]-buy>currentProfit){
                currentProfit=prices[i]-buy;
            }

            if(prices[i]<buy){
                buy=prices[i];
            }


        }

        return currentProfit;


    }

    public String removeKdigits(String num, int k) {
        //456654321   k = 3
        //654321. k = 3
        //12345654 k = 3

        //1219 k = 1, remove local peak from the highest bit

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> dq = new ArrayDeque<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && dq.size() > 0 && num.charAt(i) < dq.peekLast()) {
                dq.pollLast();
                k--;
            }
            dq.addLast(num.charAt(i));
            i++;
        }
        while (k > 0 && dq.size() > 0) {
            dq.pollLast();
            k--;
        }
        while (dq.size() > 0) {
            char c = dq.pollFirst();
            if (sb.length() > 0 || c != '0') {
                sb.append(c);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public String removeKdigits2(String num, int k) {
        int len = num.length();
        //corner case
        if (k == len)
            return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
