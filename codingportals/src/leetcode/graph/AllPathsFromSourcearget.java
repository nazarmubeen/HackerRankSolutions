package leetcode.graph;

import java.util.LinkedList;
import java.util.List;

public class AllPathsFromSourcearget {
    List<List<Integer>> result = new LinkedList<>();

    public static void main(String[] args) {
        AllPathsFromSourcearget obj = new AllPathsFromSourcearget();
        int[][] arr = new int[][]{{1, 2}, {3}, {3}, {}};
        obj.allPathsSourceTarget(arr);
    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        LinkedList<Integer>[] mainGraph = new LinkedList[graph.length];

        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            mainGraph[i] = new LinkedList<Integer>();
            int colLength = graph[i].length;

            for (int j = 0; j < colLength; j++) {
                mainGraph[i].add(graph[i][j]);
            }
        }
        LinkedList<Integer> answer = new LinkedList<Integer>();

        traverse(0, mainGraph, answer, visited);


        return result;

    }

    void traverse(int node, LinkedList<Integer>[] mainGraph, LinkedList<Integer> list, boolean[] visited) {
        System.out.println("visiting node " + node);

        if (visited[node] == true) {
            return;
        }

        visited[node] = true;
        list.add(node);

        LinkedList<Integer> childNodes = mainGraph[node];
        if (node == mainGraph.length - 1) {
            System.out.println("list " + list);
            result.add(new LinkedList<>(list));
        } else {

            for (int child : childNodes) {
                traverse(child, mainGraph, list, visited);
            }
        }

        visited[node] = false;
        list.remove(list.size() - 1);


    }

}
