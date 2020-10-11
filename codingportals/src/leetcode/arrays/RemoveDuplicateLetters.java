package leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();

        int[] count = new int[26];

        boolean[] used = new boolean[26];

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            //increase count
            count[ch - 'a']++;
        }

        for (char c : chars) {
            //reduce count
            count[c - 'a']--;
            //is already used
            if (used[c - 'a']) {
                continue;
            }


            // 1. result length is greater than 0
            // 2. last char is greater than current char
            // 3. count of last character is greater than 0;
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                used[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            //add it to result
            sb.append(c);
            //make it true to know if this already used
            used[c - 'a'] = true;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters c = new RemoveDuplicateLetters();
        c.removeDuplicateLetters("cbacdcbc");
    }
}
