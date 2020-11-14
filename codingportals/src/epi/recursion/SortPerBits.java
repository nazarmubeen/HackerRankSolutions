package epi.recursion;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class sortPerBits {
    public int[] sortByBits(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];


        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            int w1 = getOnes(a);
            int w2 = getOnes(b);

            if (w1 == w2) {
                return b - a;
            }

            return w2 - w1;

        });

        for (int number : arr) {
            q.add(number);
        }

        int k = n - 1;

        while (k >= 0 && !q.isEmpty()) {

            result[k] = q.poll();
            k--;

        }

        return result;
    }


    private int getOnes(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}