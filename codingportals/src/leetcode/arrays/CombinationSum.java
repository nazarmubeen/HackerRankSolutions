package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        CombinationSum c = new CombinationSum();
        c.combinationSum(candidates, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = null;
        Arrays.sort(candidates);
        LinkedList<Integer> currentList = new LinkedList<>();
        if (candidates != null && candidates.length > 0) {
            result = new ArrayList<>();
        }

        backtracking(result, 0, target, candidates, currentList);

        return result;
    }

    void backtracking(List<List<Integer>> result, int currentIndex, int target, int[] candidates, LinkedList<Integer> currentList) {

        System.out.println(" current List {} " + currentList);
        if (target == 0) {
            result.add((List<Integer>) currentList.clone());
            return;
        }

        if (currentIndex == candidates.length || target < candidates[currentIndex]) return;
        currentList.addLast(candidates[currentIndex]);
        backtracking(result, currentIndex, target - candidates[currentIndex], candidates, currentList); // Choose ith candidate
        currentList.removeLast();
        backtracking(result, currentIndex + 1, target, candidates, currentList); // skip ith candidate

    }

}
