package leetcode.arrays;

public class NextPermutation {


    public static void main(String[] args) {
        nextPermutation(new int[]{1, 2, 3});
    }


    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int last = nums.length - 2;

        while (last >= 0 && nums[last] >= nums[last + 1]) {
            last--;
        }

        if (last >= 0) { // bug - 2 => a found;
            int j = nums.length - 1;
            while (nums[j] <= nums[last]) j--; // bug - 2 => there must a j bigger;
            swap(nums, last, j);
        }
        reverse(nums, last + 1, nums.length - 1);
    }

    static void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
