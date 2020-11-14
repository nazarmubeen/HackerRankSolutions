package heaps;


import java.util.PriorityQueue;

public class JavaHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = getMinHeap();

        PriorityQueue<Integer> maxHeap = getMaxHeap();

        PriorityQueue<Integer> defaultHeap = getHeap();

        for (int i = 0; i < 9; i++) {
            minHeap.offer(i);
            maxHeap.offer(i);
            defaultHeap.offer(i);
        }
        System.out.println("minHeap");

        while (!minHeap.isEmpty()) {
            System.out.print(" " + minHeap.poll());
        }

        System.out.println();
        System.out.println("maxheap");

        while (!maxHeap.isEmpty()) {
            System.out.print(" " + maxHeap.poll());
        }
        System.out.println();
        System.out.println("defaultHeap");
        while (!defaultHeap.isEmpty()) {
            System.out.print(" " + defaultHeap.poll());
        }
    }

    private static PriorityQueue<Integer> getMinHeap() {
        return new PriorityQueue<>((a, b) -> a - b);
    }

    private static PriorityQueue<Integer> getMaxHeap() {
        return new PriorityQueue<>((a, b) -> b - a);
    }

    private static PriorityQueue<Integer> getHeap() {
        return new PriorityQueue<>();
    }


}
