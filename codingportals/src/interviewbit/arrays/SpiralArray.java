package interviewbit.arrays;

import main.java.arrays.ArrayUtils;

public class SpiralArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][1];

        arr[0] = new int[]{1};
        arr[1] = new int[]{4};
        arr[2] = new int[]{7};

        spiralOrder(arr);
    }


    public static int[] spiralOrder(final int[][] A) {

        int top = 0;
        int right = A[0].length - 1;
        int bottom = A.length - 1;
        int left = 0;
        int dir = 0;
        int[] resultArray = new int[(A.length) * (A[0].length)];
        int resultIndex = 0;

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++)
                    resultArray[resultIndex++] = (A[top][i]);
                top++;
                dir++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++)
                    resultArray[resultIndex++] = (A[i][right]);
                right--;
                dir++;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--)
                    resultArray[resultIndex++] = (A[bottom][i]);
                bottom--;
                dir++;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--)
                    resultArray[resultIndex++] = (A[i][left]);
                left++;
                dir = 0;
            }

        }

        return resultArray;

    }
}
