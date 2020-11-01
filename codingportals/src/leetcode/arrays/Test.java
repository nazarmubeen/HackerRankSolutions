package leetcode.arrays;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        titleToNumber("Z");
    }

    public static int titleToNumber(String s) {

        char[] charArray = s.toCharArray();
        int value = 0;
        int val = 'Z' - 'A';
        System.out.println("value " + val);
        for (char c : charArray) {
            System.out.println("c " + c);
            val = c - 'A';
            System.out.println("value " + val);

        }

        return value;
    }
}
