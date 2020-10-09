package grokkingpatterns.modifiedbinarysearch;

class CeilingOfANumber {

    public static int searchCeilingOfANumber(int[] arr, int key) {
        if (key > arr[arr.length - 1]) // if the 'key' is bigger than the biggest element
            return -1;
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (high >= low) {
            mid = low + (high - low) / 2;

            if (arr[mid] > key) {
                high = mid - 1;

            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }


        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 6));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{1, 3, 8, 10, 15}, 12));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 17));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, -1));
    }
}
