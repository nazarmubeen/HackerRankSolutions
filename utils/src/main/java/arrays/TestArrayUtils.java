package main.java.arrays;

public class TestArrayUtils {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ArrayUtils.printArray(arr);
        int[][] matrix = {{10, 20, 30}, {30, 40, 40}, {30, 40, 40}};
        ArrayUtils.printArrayMatrix(matrix);
    }
}
