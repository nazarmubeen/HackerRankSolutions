package interviewbit.arrays;

import main.java.arrays.ArrayUtils;

public class SpiralOrder2 {

    public static void main(String[] args) {
        generateMatrix(4);
    }

    public static int[][] generateMatrix(int A) {

        int[][] result = new int[A][A];

        int n = 1;

        int dir = 0;
        int top = 0;
        int left = 0;
        int right = result.length - 1;
        int bottom = result[0].length - 1;

        while (top <= bottom && left <= right) {

       /*     System.out.println(" top "+top);
            System.out.println(" bottom "+bottom);
            System.out.println(" left "+left);
            System.out.println(" right "+right);
            System.out.println(" n "+n);*/
            if (dir == 0) {

                for (int i = left; i <= right; i++) {
                    result[top][i] = n++;
                }

                top++;
                dir++;
            }

            ArrayUtils.printArrayMatrix(result);
            System.out.println(" n " + n);


            if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    result[i][right] = n++;
                }

                right--;
                dir++;
            }
            ArrayUtils.printArrayMatrix(result);
            System.out.println(" n " + n);


            if (dir == 2) {

                for (int i = right; i >= left; i--) {
                    result[bottom][i] = n++;
                }

                bottom--;
                dir++;
            }
            ArrayUtils.printArrayMatrix(result);
            System.out.println(" n " + n);


            if (dir == 3) {

                for (int i = bottom; i >= top; i--) {
                    result[i][left] = n++;
                }

                left++;
                dir = 0;
            }
            ArrayUtils.printArrayMatrix(result);

        }


        return result;


    }
}
