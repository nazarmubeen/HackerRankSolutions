package grokkingpatterns.modifiedbinarysearch;

class MinimumDifference {

    public static int searchMinDiffElement(int[] arr, int key) {
        if (key < arr[0])
            return arr[0];
        if (key > arr[arr.length - 1])
            return arr[arr.length - 1];

        int low = 0;
        int high = arr.length;
        int mid;


        while (low < high) {

            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            }
        }

        if ((arr[low] - key) < (key - arr[high]))
            return arr[low];
        return arr[high];
    }

    public static void main(String[] args) {
        System.out.println(MinimumDifference.searchMinDiffElement(new int[]{4, 6, 10}, 7));
        System.out.println(MinimumDifference.searchMinDiffElement(new int[]{4, 6, 10}, 4));
        System.out.println(MinimumDifference.searchMinDiffElement(new int[]{1, 3, 8, 10, 15}, 12));
        System.out.println(MinimumDifference.searchMinDiffElement(new int[]{4, 6, 10}, 17));
    }
}