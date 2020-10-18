package leetcode.arrays;

import java.util.*;

public class RepeatedDNASequences {

    List<String> results;

    public List<String> findRepeatedDnaSequences(String s) {

        List<String> results = new ArrayList<>();
        int size = s.length();
        int left = 0, right = 9;

        Set<String> keySet = new HashSet();
        Set<String> seenSet = new HashSet();

        while (left < right && right < size) {
            String key = s.substring(left, right + 1);

            if (keySet.contains(key) && !seenSet.contains(key)) {
                results.add(key);
                seenSet.add(key);
            } else {
                keySet.add(key);
            }


            left++;
            right++;
        }

        return results;

    }

    public static void main(String[] args) {
        RepeatedDNASequences obj = new RepeatedDNASequences();
        obj.findRepeatedDnaSequences("AAAAAAAAAAAAA");
    }
}
