package grokkingpatterns.twoheaps;

import java.util.PriorityQueue;

class MedianOfAStream {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a1, a2) -> a2 - a1);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a1, a2) -> a1 - a2);

    public void insertNum(int num) {

        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        balance();

    }

    private void balance() {

        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size() < minHeap.size())
            maxHeap.add(minHeap.poll());
    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size()) {
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        } else {
            return maxHeap.peek();
        }

    }

    public static void main(String[] args) {
        MedianOfAStream medianOfAStream = new MedianOfAStream();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(5);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(4);
        System.out.println("The median is: " + medianOfAStream.findMedian());
    }
}