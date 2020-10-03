package grokkingpatterns.topkelements;

import java.util.PriorityQueue;

class KthLargestNumberInStream {
    PriorityQueue<Integer> minHeap;

    public KthLargestNumberInStream(int[] nums, int k) {

        minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }


    }

    public int add(int num) {
        if (num > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(num);
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 1, 5, 12, 2, 11};
        KthLargestNumberInStream kthLargestNumber = new KthLargestNumberInStream(input, 4);
        System.out.println("4th largest number is: " + kthLargestNumber.add(6));
        System.out.println("4th largest number is: " + kthLargestNumber.add(13));
        System.out.println("4th largest number is: " + kthLargestNumber.add(4));
    }
}
