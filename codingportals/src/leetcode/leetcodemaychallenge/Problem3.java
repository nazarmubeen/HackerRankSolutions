package leetcode.leetcodemaychallenge;

import java.util.Arrays;
import java.util.HashMap;

public class Problem3 {

    public static void main(String[] args) {

        String a = "aa";
        String b = "aab";

        System.out.println(canConstructOptimiseMore(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        char[] rArray = ransomNote.toCharArray();
        char[] mArray = magazine.toCharArray();

        Arrays.sort(rArray);
        Arrays.sort(mArray);

        int rPointer = 0;
        int mPointer = 0;

        while (true) {

            if (rPointer >= rArray.length) {
                return true;
            }

            if (mPointer >= mArray.length && rPointer < rArray.length) {
                return false;
            }

            if (rArray[rPointer] < mArray[mPointer]) {
                return false;
            }

            if (rArray[rPointer] > mArray[mPointer]) {
                mPointer++;
            } else {
                mPointer++;
                rPointer++;
            }

        }


    }

    public static boolean canConstructOptimise(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        for (int i = 0; i < magazine.length(); i++) {

            char c = magazine.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char c = ransomNote.charAt(i);

            if (map.get(c) == null || map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }


    public static boolean canConstructOptimiseMore(String ransomNote, String magazine) {


        int[] chars = new int[26];
        int counts = 0;

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            System.out.println("index is "+index);
            if (chars[index] == 0) counts++;
            chars[index]++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            System.out.println("index is "+index);
            if (chars[index] == 1) counts--;
            if (counts == 0) return true;
            chars[index]--;
        }

        return counts == 0;

    }
}
