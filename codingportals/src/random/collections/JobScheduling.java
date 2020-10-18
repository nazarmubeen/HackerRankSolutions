package random.collections;

import main.java.arrays.ArrayUtils;
import org.assertj.core.util.Arrays;

class JobScheduling {
    public static int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty == null || jobDifficulty.length == 0) {
            return 0;
        }
        if (jobDifficulty.length < d) {
            return -1;
        }
        int n = jobDifficulty.length;
        // states
        int[][] f = new int[n + 1][d + 1];
        // initialization
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= d; j++) {
                f[i][j] = Integer.MAX_VALUE / 2;
                //  System.out.println("i "+i+" j "+j);
                // ArrayUtils.printArrayMatrix(f);
            }
        }

        // System.out.println("final matrix ");
        // ArrayUtils.printArrayMatrix(f);

        // function
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, d); j++) {
                for (int r = i; r >= j; r--) {
                    System.out.println("i " + i + " j " + j + " r " + r);
                    //   System.out.println("r "+r+" i "+i);
                    int currentMax = max(jobDifficulty, r, i);
                    //  System.out.println("currentMax "+currentMax);
                    System.out.println("old value" + f[i][j]);
                    System.out.println("adding value " + f[r - 1][j - 1] + " row " + (r - 1) + " col " + (j - 1));
                    System.out.println("f[r - 1][j - 1] " + f[r - 1][j - 1]);

                    f[i][j] = Math.min(f[i][j], f[r - 1][j - 1] + currentMax);
                    System.out.println("new value " + f[i][j]);
                }
            }
        }

        //System.out.println("final matrix ");
        // ArrayUtils.printArrayMatrix(f);
        // answer
        return f[n][d];
    }

    public static int max(int[] arr, int start, int end) {
        System.out.println(" start " + start + " end " + end);
        int max = 0;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, arr[i - 1]);
        }
        System.out.println(" max is = " + max);
        return max;
    }

    public static void main(String[] args) {
        minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2);
    }
}