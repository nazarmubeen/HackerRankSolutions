package grokkingpatterns.topkelements;

import main.java.arrays.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class FrequencySort {

    public static String sortCharacterByFrequency(String str) {

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());


        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            int value = maxHeap.peek().getValue();
            for (int i = 0; i < value; i++)
                sb.append(maxHeap.peek().getKey());

            maxHeap.poll();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String result = FrequencySort.sortCharacterByFrequency("Programming");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);

        // result = FrequencySort.sortCharacterByFrequency("abcbab");
        // System.out.println("Here is the given string after sorting characters by frequency: " + result);
    }
}