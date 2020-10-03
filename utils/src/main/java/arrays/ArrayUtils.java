package main.java.arrays;

import org.assertj.core.util.Arrays;

public class ArrayUtils {


    public static void printArray(Object arr) {
        System.out.println(" ");
        System.out.print(Arrays.asList(arr));
    }

    public static void printArrayMatrix(Object[] arr) {
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.asList(arr[i]));
            System.out.println(" ");
        }
    }
}
