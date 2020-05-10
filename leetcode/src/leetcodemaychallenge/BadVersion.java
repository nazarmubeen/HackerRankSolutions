package leetcodemaychallenge;

import java.math.BigDecimal;

public class BadVersion {
    public  static void main(String[] args){


        int n=3;
        System.out.println(firstBadVersion(100));
    }


    public static int firstBadVersion(int n) {
        int left = 1;
        int right  = n;

        while( left < right) {
            int mid = left + (right -left)/2;
            if(isBadVersion(mid) == true){
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public static int firstBadVersion2(int n) {

        long start=1;
        long end=n;

        int badVersion=-1;
        boolean badVersionFound=false;

        while(true){

            if(badVersion==start || badVersion==end){
                return badVersion;
            }
            long mid=(start+end)/2;
            int midValue= (int) mid;
            System.out.println(" start "+start+" end "+end);
            boolean isBadversionMid=isBadVersion(midValue);
            if(isBadversionMid==true && mid-1>=start){
                badVersionFound=true;
                badVersion=midValue;
                end=midValue-1;
            }
            else if(isBadversionMid){
                return midValue;
            }
            else{
                start=midValue+1;
            }



        }
    }

    static boolean isBadVersion(int n){

        System.out.println(" n is "+n);
        int k=15;

        if(n>=k){
            return true;
        }

        return false;
    }

}
