package leetcode.dp;

public class MinimumJump {

    public static int jump(int[] A) {
        if (A.length == 1)
            return 0;
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            System.out.println(i);
            curFarthest = Math.max(curFarthest, i + A[i]);
            if (i == curEnd) {
                if (curFarthest <= i)
                    return -1;
                jumps++;
                curEnd = curFarthest;
            }
        }
//	if(jumps==1)
//	return -1;
        System.out.println(jumps);
        return jumps;
    }

    public static void main(String[] args){
        jump(new int[]{2,3,1,1,4});

    }

}
