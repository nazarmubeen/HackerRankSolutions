package leetcodemaychallenge.topquestion.dp;

import java.util.*;

public class WordBreak {

    public boolean wordBreak1(String s, List<String> wordDict) {


        Set<String> hashset = new HashSet<String>();

        for (String st : wordDict) {
            hashset.add(st);
        }

        return helper1(s, hashset);

    }

    boolean helper1(String s, Set<String> wordDict) {
        int[] pos = new int[s.length() + 1];

        Arrays.fill(pos, -1);

        pos[0] = 0;

        for (int i = 0; i < s.length(); i++) {
            if (pos[i] != -1) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String sub = s.substring(i, j);
                    if (wordDict.contains(sub)) {
                        pos[j] = i;
                    }
                }
            }
        }

        return pos[s.length()] != -1;
    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-hard/121/dynamic-programming/865/
    public List<String> wordBreak(String s, List<String> wordDict) {

        Set<String> hashset = new HashSet<String>();

        for (String st : wordDict) {
            hashset.add(st);
        }

        return helper(s, hashset);
    }

    List<String> helper(String s, Set<String> wordDict) {
        ArrayList<String>[] pos = new ArrayList[s.length() + 1];
        pos[0] = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            if (pos[i] != null) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String sub = s.substring(i, j);
                    if (wordDict.contains(sub)) {
                        if (pos[j] == null) {
                            ArrayList<String> list = new ArrayList<String>();
                            list.add(sub);
                            pos[j] = list;
                        } else {
                            pos[j].add(sub);
                        }

                    }
                }
            }
        }

        if (pos[s.length()] == null) {
            return new ArrayList<String>();
        } else {
            ArrayList<String> result = new ArrayList<String>();
            dfs(pos, result, "", s.length());
            return result;
        }
    }

    public void dfs(ArrayList<String>[] pos, ArrayList<String> result, String curr, int i) {
        if (i == 0) {
            result.add(curr.trim());
            return;
        }

        for (String s : pos[i]) {
            String combined = s + " " + curr;
            dfs(pos, result, combined, i - s.length());
        }
    }

}
