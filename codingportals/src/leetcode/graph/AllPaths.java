package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

class AllPath {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {


        List<List<Integer>> answer = new ArrayList<>();
        boolean[] isVisited = new boolean[graph.length];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            if (!isVisited[i]) {
                helper(graph, i, answer, list, isVisited);
            }
        }

        return answer;
    }

    private void helper(int[][] graph, int node, List<List<Integer>> answer, List<Integer> list, boolean[] isVisited) {
        ///    System.out.println("node "+node);
        //   System.out.println("list "+list);
        //   System.out.println("answer "+answer);
        list.add(node);
        isVisited[node] = true;
        int[] nodes = graph[node];
        //  System.out.println("nodes "+nodes.length);
        for (int i = 0; i < nodes.length; i++) {
            helper(graph, nodes[i], answer, list, isVisited);
        }

        if (nodes.length == 0) {
            answer.add(new ArrayList<>(list));
        }


        list.remove(list.size() - 1);

    }
}
