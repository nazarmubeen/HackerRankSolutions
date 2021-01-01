package arrays;

import java.util.Arrays;

public class SumtHREE {
    public static void main(String[] args) {
        threeSumClosest(new int[]{2, 1, -9, -7, -8, 2, -8, 2, 3, -8}, -1);
    }

    public static int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);

        int sum = 0;


        for (int i = 0; i < A.length; i++) {
            int right = A.length - 1;
            int left = i + 1;

            if (i > 0 && A[i] == A[i - 1])
                continue;

            while (left < right) {

                if (right < A.length - 1 && A[right] == A[right + 1]) {
                    right--;
                }

                if (A[i] + A[left] + A[right] > B) {
                    sum = A[i] + A[left] + A[right];
                    right--;
                } else if (A[i] + A[left] + A[right] < B) {
                    sum = A[i] + A[left] + A[right];
                    left++;
                } else {
                    sum = A[i] + A[left] + A[right];
                    return sum;
                }


            }

        }

        return sum;

    }
}
