package random.collections;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {

        topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> answ = new ArrayList<String>();
        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("map " + map);

        PriorityQueue<Map.Entry<String, Integer>> sortedMap = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue() - o1.getValue();
            }
        });
        sortedMap.addAll(map.entrySet());
        System.out.println("sortedMap " + sortedMap);

        while (!sortedMap.isEmpty() && k > 0) {

            answ.add(sortedMap.poll().getKey());
            k--;
        }

        System.out.println("answ " + answ);


        return answ;

    }
}
