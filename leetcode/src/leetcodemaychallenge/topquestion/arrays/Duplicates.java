package leetcodemaychallenge.topquestion.arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args){

        System.out.println("");
    }

    public int removeDuplicates(int[] nums) {

        int length=1;
        int currentIndex=0;
        for(int i:nums){

            if(nums[currentIndex]==i){
                continue;
            }
            else{
                length++;
                currentIndex++;
                nums[currentIndex]=i;
            }

        }
        return length;
    }

    public int maxProfit(int[] prices) {

        int profit=0;
        int currentPrice=prices[0];

        for(int i=1;i<prices.length;i++){

            if (prices[i]>currentPrice){
                profit=profit+prices[i]-currentPrice;
            }

            currentPrice=prices[i];
        }

        return profit;
    }

}
