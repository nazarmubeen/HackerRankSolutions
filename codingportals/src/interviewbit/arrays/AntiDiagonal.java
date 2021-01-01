package interviewbit.arrays;

public class AntiDiagonal {

    public static void main(String[] args) {

        int[][] arr = new int[3][1];

        arr[0] = new int[]{1, 3, 4};
        arr[1] = new int[]{5, 6, 7};
        arr[2] = new int[]{8, 9, 10};

        diagonal(arr);
    }

    public static int[][] diagonal(int[][] A) {

        int[][] result = new int[A.length][];
        int m = 0;

        int top = 0;
        int bottom = 0;


        while (top < A.length && bottom < A[0].length) {

            int[] arr = new int[Math.abs(bottom - top) + 1];

            int k = 0;

            int i = top;
            int j = bottom;
            System.out.println(" i " + i + " j " + j);
            while (i <= bottom && j >= top && k < (bottom - top + 1)) {

                arr[k++] = A[i][j];
                i++;
                j--;
            }


            if (bottom == A[0].length - 1) {
                top++;
            } else {
                bottom++;
            }

            result[m++] = arr;

        }

        return result;


    }

}
