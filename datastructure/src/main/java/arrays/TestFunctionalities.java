package arrays;

import main.java.arrays.ArrayUtils;

import java.util.ArrayList;

public class TestFunctionalities {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            list.add((int) (i * 3 * Math.random()));
        }

        System.out.println(list);

        //assign to array

        Integer[] arr = new Integer[list.size()];

        list.toArray(arr);

        ArrayUtils.printArray(arr);

        String s = "";
        s.isEmpty();
    }
}
