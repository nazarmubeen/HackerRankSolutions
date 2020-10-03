package grokkingpatterns.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Subsets {

    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        backTracking(subsets, sb, 0, nums);
        return subsets;
    }

    public static void backTracking(List<List<Integer>> subsets, List<Integer> sb, int currentIndex, int[] nums) {
        subsets.add(new ArrayList<>(sb));
        if (sb.size() == nums.length) {
            return;
        }

        for (int i = currentIndex; i < nums.length; i++) {
            sb.add(nums[i]);
            backTracking(subsets, sb, ++currentIndex, nums);
            sb.remove(sb.size() - 1);
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> result = Subsets.findSubsets(new int[]{1, 3});
        System.out.println("Here is the list of subsets: " + result);

        result = Subsets.findSubsets(new int[]{1, 5, 3});
        System.out.println("Here is the list of subsets: " + result);
    }
}