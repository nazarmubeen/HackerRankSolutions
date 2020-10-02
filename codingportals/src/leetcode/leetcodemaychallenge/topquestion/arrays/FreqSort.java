package leetcode.leetcodemaychallenge.topquestion.arrays;

import java.util.*;

public class FreqSort {

    public static void main(String[] args) {

        System.out.println(frequencySort("Aabb"));
    }

    public static String frequencySort(String s) {

        if (s.isEmpty() || s.length() == 0)
            return s;
        int[] map = new int[128];
        char[] cA = s.toCharArray();

        for (char c : cA)
            map[c]++;

        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); ) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < 128; j++) {
                if (map[j] > max) {
                    max = map[j];
                    index = j;
                }
            }
            while (map[index] > 0) {
                result[i++] = (char) index;
                map[index]--;
            }
        }
        return new String(result);
    }


    public String frequencySort2(String s) {

        int len = s.length();
        // Assuming Extended ASCII encoding.
        int[] freq = new int[256];

        // Step 1: Store freq of each character. c:3, r:2, w:2, t:1
        // And finding max vertical bucket levels.
        int bucketLevel = 0;
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)]++;

            bucketLevel = Math.max(bucketLevel, freq[s.charAt(i)]);
        }

        // Step 2: Prepare multi storage bucket.
        // With each storage level characters with same frequency.
        StringBuilder[] bucketBuilder =
                new StringBuilder[bucketLevel + 1];

        for (int i = 0; i < bucketBuilder.length; i++) {
            bucketBuilder[i] = new StringBuilder();
        }
        // Step 3: bucket[3] = c , bucket[2] = rw , bucket[1] = t
        for (int i = 0; i < 256; i++) {

            int elemFreq = freq[i];
            if (elemFreq > 0) {
                bucketBuilder[elemFreq].
                        append(Character.toString((char) (i)));
            }

        }

        // Step 4: Merge elements with same freq/bucket level in ans.
        StringBuilder ans = new StringBuilder();
        for (int i = bucketLevel; i > 0; i--) {

            char[] levelChars = bucketBuilder[i].
                    toString().toCharArray();

            for (int j = 0; j < levelChars.length; j++) {

                for (int k = 0; k < i; k++) {
                    ans.append(levelChars[j]);
                }

            }

        }

        return ans.toString();


    }

    public String frequencySort3(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int element = map.get(s.charAt(i));
                map.put(s.charAt(i), ++element);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        // System.out.print(map.keySet());
        List<Character> list = new ArrayList<>(map.keySet());
        System.out.println("list1 " + list);
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder string = new StringBuilder();
        System.out.println("list2 " + list);
        for (char chars : list) {
            int count = map.get(chars);
            for (int i = 0; i < count; i++) {
                string.append(chars);
            }
        }
        return string.toString();
    }


}
