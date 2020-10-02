package leetcode.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {
        int[][] result = new int[people.length][];
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                System.out.println(" ===");
                System.out.println(" a1 " + a1[0] + " " + a1[1]);
                System.out.println(" a2 " + a2[0] + " " + a2[1]);
                if (a1[0] != a2[0]) {
                    return a2[0] - a1[0];
                } else {
                    return a1[1] - a2[1];
                }
            }
        });

        ArrayList<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < people.length; i++) {
            int[] arr = people[i];
            list.add(arr[1], arr);
        }

        for (int i = 0; i < people.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
