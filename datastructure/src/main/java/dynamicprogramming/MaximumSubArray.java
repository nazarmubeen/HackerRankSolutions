package main.java.dynamicprogramming;

public class MaximumSubArray {

    public static void main(String[] args){

        int[] a= {904,40,523,12,-335,-385,-124,481,-31};

        int sum=0 , minSum=0, maxSum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];

            if(sum<minSum){
                minSum=sum;
            }

            if(sum-minSum>maxSum){
                maxSum=sum-minSum;
            }

        }

        System.out.println(maxSum);
    }

}
