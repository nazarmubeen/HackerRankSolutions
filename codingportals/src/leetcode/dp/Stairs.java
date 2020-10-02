package leetcode.dp;

public class Stairs {

    public int climbStairs(int A) {

        if(A==1 || A==0){
            return 1;
        }

        return climbStairs(A-1) + climbStairs(A-2);
    }

    public int climbStairsApproach2(int a) {
        if(a ==0){
            return 0;
        }
        if(a ==1){
            return 1;
        }
        int cache[] = new int [a] ;
        cache[0] = 1;
        cache[1] = 2;
        for(int i = 2 ; i < a ; i++){
            cache[i] = cache[i - 1] + cache[i - 2];

        }
        return cache[a-1];

    }
}
