package string;

import java.util.*;

public class PercentageCalculation {

    public static void main(String[] args) {

        HashMap<String, Set<String>> map = new HashMap<>();

        Set<String> set1 = new HashSet<>();
        set1.add("t1");
        set1.add("t2");

        map.put("a", set1);
        set1 = new HashSet<>();
        set1.add("t1");
        set1.add("t3");
        map.put("b", set1);

        set1 = new HashSet<>();
        set1.add("t4");
        set1.add("t5");
        map.put("c", set1);
        calculatePercentage(map);

    }

    static List<Set<String>> calculatePercentage(HashMap<String, Set<String>> map) {

        HashMap<String, Integer> countMap = new HashMap<>();

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {

            Set<String> set = entry.getValue();
            for (String value : set) {
                countMap.put(value, countMap.getOrDefault(value, 0) + 1);
            }
        }

        System.out.println("countMap " + countMap);
        int size = map.size();

        List<String> list = new LinkedList<>();

        for (String k : countMap.keySet()) {

            if (countMap.get(k) <= size) {
                list.add(k);
            }

        }

        System.out.println(list);

        Collections.sort(list, (s1, s2) -> countMap.get(s2) - countMap.get(s1));

        System.out.println(list);
        List<Set<String>> answer = new ArrayList<>();
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int currentSize = countMap.get(list.get(i));
            Set<String> answ = new HashSet<>();
            answ.add(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {

                while (currentSize < size) {
                    currentSize += countMap.get(list.get(j));
                    answ.add(list.get(j));
                    answer.add(answ);
                    System.out.println("answ " + answ);
                }


            }
        }

        System.out.println(" answer " + answer);
        return answer;
    }

}
