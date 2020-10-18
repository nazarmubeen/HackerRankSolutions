package random.collections;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        String[] s = {"a"};
        mostCommonWord("a, a, a, a, b,b,b,c, c", s);
    }


    public static String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(banned));

        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!set.contains(word))
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<>((a1, a2) -> map.get(a2) - map.get(a1));

        sortedMap.putAll(map);
        System.out.println(sortedMap);


        return sortedMap.firstKey();
    }

    public class Pair {

        String key;
        int frequency;

    }


}
