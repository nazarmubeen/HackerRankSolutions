package arrays;

import java.util.Arrays;

public class LargestNum {

    public static void main(String[] args) {
        LargestNum l = new LargestNum();
        String result = l.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(result);
    }

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i] + "";
        }

        Arrays.sort(strs, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s1.compareTo(s2);
        });


        if (strs[strs.length - 1].charAt(0) == '0') return "0";


        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i] + res;
        }
        return res;
    }
}
