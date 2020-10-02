package leetcode.leetcodemaychallenge.topquestion.arrays;

import algo.u.ArrayUtilFunc;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args){
       // int[] nums = {4,1,2,1,2};

        int[] digits={2,7,11,15};
      //  moveZeroes(digits);
        twoSum(digits,9);
        // plusOne(digits);
        //rotate(nums,3);
       // singleNumber(nums);
      //  int [] nums1 = {4,9,5};
      //  int[]  nums2 = {9,4,9,8,4};
     //   intersect(nums1,nums2);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int startIndex = 0; count < nums.length; startIndex++) {
            int currentIndex = startIndex;
            int prev = nums[startIndex];
            do {
                int toIndex = (currentIndex + k) % nums.length;
                int temp = nums[toIndex];
                nums[toIndex] = prev;

                prev = temp;
                currentIndex = toIndex;
                count++;
            } while (startIndex != currentIndex);
        }

    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<=nums.length-1;i+=2){
            System.out.println(" i "+i);
            if( (i+1)<nums.length && nums[i]!=nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1=nums1.length;
        int length2=nums2.length;

        int smallestLength=(length1>length2)?length1:length2;

        int pointer1=0,pointer2=0, k=0;

        while(true){

            if(pointer1>=length1 || pointer2>=length2){
                break;
            }

            if(nums1[pointer1]==nums2[pointer2]){
                nums1[k]=nums1[pointer1];
                pointer1++;
                pointer2++;
                k++;

            }

            else if(nums1[pointer1]<nums2[pointer2]){
                pointer1++;
            }

            else if(nums1[pointer1]>nums2[pointer2]){
                pointer2++;
            }



        }



        return Arrays.copyOfRange(nums1,0,k);
    }

    public static int[] plusOne(int[] arr) {
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]+carry>9 ){
                carry=1;
                arr[i]=0;
                continue;
            }

            if(carry>0){
                arr[i]=arr[i]+carry;
                carry=0;
            }

        }

        System.out.println(" carry "+carry);
        if(carry!=0){
            int[] newArr=new int[arr.length+1];
            newArr[0]=carry;

            for(int i=1;i<newArr.length-1;i++){
                newArr[i]=arr[i-1];
            }
            return newArr;
        }

        return arr;
    }

    public static void moveZeroes(int[] nums) {

        int zeroindex=-1;

        for(int i=0;i<=nums.length-1;i++){



            if(nums[i]==0 && zeroindex==-1){
                zeroindex=i;
            }
            else if(nums[i]==0 ){
                continue;
            }



            else if (zeroindex>=0 && zeroindex<i){
                nums[zeroindex]=nums[i];
                nums[i]=0;
                zeroindex++;
            }


        }
        ArrayUtilFunc.printArray(nums);
        System.out.println(" zeroindex "+zeroindex);
    }


    public static int[] twoSum(int[] nums, int target) {
        int [] answ=new int[2];
        for(int i=0;i<nums.length;i++){

            answ[0]=i;

            for(int j=i+1;j<nums.length;j++){

                if(nums[j]==target-nums[i])
                {
                    answ[1]=j;
                    return answ;
                }
            }

        }
        return null;
    }

}
