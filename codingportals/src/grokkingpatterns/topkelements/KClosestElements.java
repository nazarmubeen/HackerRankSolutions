package grokkingpatterns.topkelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Entry {
    int key;
    int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class KClosestElements {

    public static List<Integer> findClosestElements(int[] arr, int K, Integer X) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<Entry> maxHeap = new PriorityQueue<>((a, b) -> b.value - a.value);

        for (int i = 0; i < K; i++) {
            int dist = Math.abs(X - arr[i]);
            Entry e = new Entry(arr[i], dist);
            maxHeap.add(e);
        }

        for (int i = K; i < arr.length; i++) {
            int dist = Math.abs(X - arr[i]);
            if (dist < maxHeap.peek().value) {
                maxHeap.poll();
                Entry e = new Entry(arr[i], dist);
                maxHeap.add(e);
            }

        }

        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().key);
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = KClosestElements.findClosestElements(new int[]{5, 6, 7, 8, 9}, 3, 7);
        System.out.println("'K' closest numbers to 'X' are: " + result);

        result = KClosestElements.findClosestElements(new int[]{2, 4, 5, 6, 9}, 3, 6);
        System.out.println("'K' closest numbers to 'X' are: " + result);

        result = KClosestElements.findClosestElements(new int[]{2, 4, 5, 6, 9}, 3, 10);
        System.out.println("'K' closest numbers to 'X' are: " + result);
    }
}