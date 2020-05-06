package leetcodemaychallenge.topquestion.arrays;

public class ArrayProblems {

    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/798/
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int red=0;
        int blue=nums.length-1;
        int i=0;

        while (i <= blue) {
            if (nums[i] == 0) {
                swap(nums, i, red);
                red++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, blue);
                blue--;
            } else {
                i++;
            }
        }

    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
