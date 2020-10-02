package leetcode.dp;

import java.util.Arrays;
import java.util.List;

public class LongestSubSequenceLength {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int longestSubsequenceLength(final List<Integer> A) {

        if(A.size()==0)
            return 0;

        int[]  lis= longestIncreasingSubsequenceLength(A);
        int[] lds =longestDecreasingSubsequenceLength(A);

        int max = lis[0] + lds[0] - 1;
        for (int i = 1; i <= A.size()-1 ; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;

        return max;
    }

    public static int[] getArray(int size){
        int[] arr=new int[size];
        for ( int i = 0; i < size; i++ )
            arr[i] = 1;
        return arr;
    }

    public static int[] longestIncreasingSubsequenceLength(final List<Integer> A) {
        int[] arr=getArray(A.size());
        for(int i=0;i<=A.size()-1;i++){
            for(int j=0;j<i;j++){
                if(A.get(i)>A.get(j) && arr[i]<arr[j]+1) {
                    arr[i]= arr[j] + 1;
                }
            }

        }
        return arr;
    }

    public static int[] longestDecreasingSubsequenceLength(final List<Integer> A) {

        int[] arr=getArray(A.size());
        for(int i=A.size()-2;i>=0;i--){
            for(int j=A.size()-1;j>i;j--){
                if(A.get(i)>A.get(j)  && arr[i]<arr[j]+1) {
                    arr[i]=  arr[j] + 1;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args){
        List<Integer> A= Arrays.asList(7, 6, 8, 10, 2, 5, 12, 30, 31, 20, 22, 18);
        System.out.println(longestSubsequenceLength(A));

    }
}
