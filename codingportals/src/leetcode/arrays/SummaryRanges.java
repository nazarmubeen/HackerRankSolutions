package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> answ = new ArrayList<>();

        if (nums.length == 0) {
            return answ;
        }

        if (nums.length == 1) {
            answ.add(String.valueOf(nums[0]));
            return answ;
        }

        int init = 0;
        int start = 0;
        int end = 0;
        StringBuffer current = new StringBuffer();

        while (start < nums.length && end < nums.length) {
            end++;

            if (end < nums.length && (nums[start] + 1 == nums[end])) {
                start++;
                continue;
            }

            if (init != start) {
                current.append(nums[init]);
                current.append("->");
                current.append(nums[start]);
            } else {
                current.append(nums[init]);
            }
            //     System.out.println("current "+current);
            answ.add(current.toString());
            current = new StringBuffer();
            start = end;
            init = start;

            if (start >= nums.length) {
                break;
            }
        }

        return answ;

    }

}
