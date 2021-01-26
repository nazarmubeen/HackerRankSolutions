package revision;

public class BinarySearchRevision implements Revision {


    @Override
    public void algo() {

    }

    /*
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
     */
    public int searchRotated(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return mid;
            //left sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

                //right sorted
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;

    }

    public int findDuplicate(int[] nums) {

        boolean[] pos = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {

            if (pos[nums[i]] == true) {
                return nums[i];
            } else {
                pos[nums[i]] = true;
            }

        }

        return -1;

    }

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + ((r - l) / 2);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        Revision r = new BinarySearchRevision();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;


    }
}
