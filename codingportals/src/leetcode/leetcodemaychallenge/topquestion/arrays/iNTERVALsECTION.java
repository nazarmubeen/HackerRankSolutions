package leetcode.leetcodemaychallenge.topquestion.arrays;

import java.util.ArrayList;
import java.util.List;

public class iNTERVALsECTION {


    public static void main(String[] args) {

    }

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int m = A.length, n = B.length;

        List<int[]> res = new ArrayList<>();

        int i = 0, j = 0;
        while (i < m && j < n) {
            int[] a = A[i];
            int[] b = B[j];

            if (a[0] >= b[0] && a[0] <= b[1]) {
                res.add(new int[]{a[0], Math.min(a[1], b[1])});
                if (a[1] < b[1]) i++;
                else j++;
            } else if (b[0] >= a[0] && b[0] <= a[1]) {
                res.add(new int[]{b[0], Math.min(a[1], b[1])});
                if (a[1] < b[1]) i++;
                else j++;
            } else if (a[0] < b[0]) {
                i++;
            } else if (a[0] > b[0]) {
                j++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public int[][] intervalIntersection2(int[][] A, int[][] B) {
        int p = 0;
        int q = 0;
        List<int[]> res = new ArrayList<>();
        while (p < A.length && q < B.length) {
            int maxStart = Math.max(A[p][0], B[q][0]);
            int minEnd = Math.min(A[p][1], B[q][1]);

            if (maxStart <= minEnd) { // overlap exists
                res.add(new int[]{maxStart, minEnd});
            }

            if (A[p][1] < B[q][1]) {
                ++p;
            } else if (A[p][1] > B[q][1]) {
                ++q;
            } else {
                ++p;
                ++q;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
