package grokkingpatterns.modifiedbinarysearch;

class FindRange {

    public static int[] findRange(int[] arr, int key) {

        int startRange = -1;
        int endRange = -1;
        int[] result = new int[]{startRange, endRange};
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                startRange = endRange = mid;
                while (arr[startRange] == key) {
                    startRange--;
                }
                while (arr[endRange] == key) {
                    endRange++;
                }
                return new int[]{startRange + 1, endRange - 1};
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }


        return result;
    }

    public static void main(String[] args) {
        int[] result = FindRange.findRange(new int[]{4, 6, 6, 6, 9}, 6);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
        result = FindRange.findRange(new int[]{1, 3, 8, 10, 15}, 10);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
        result = FindRange.findRange(new int[]{1, 3, 8, 10, 15}, 12);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }
}
