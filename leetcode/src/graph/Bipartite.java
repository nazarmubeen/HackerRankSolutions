package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Bipartite {

    ArrayList<Integer>[] graph;
    Map<Integer, Integer> color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i)
            graph[i] = new ArrayList();

        for (int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        color = new HashMap();
        for (int node = 1; node <= N; ++node)
            if (!color.containsKey(node) && !dfs(node, 0))
                return false;
        return true;

    }

    public boolean dfs(int node, int c) {
        if (color.containsKey(node)) {
            System.out.println("already colored " + node + " " + color.get(node) + " to color " + c);
            return color.get(node) == c;
        }
        color.put(node, c);
        for (int nei : graph[node]) {
            // System.out.println("c old"+c);
            //  System.out.println("c "+(c^1));
            if (!dfs(nei, c ^ 1))
                return false;
        }
        return true;
    }

    public int kthSmallest(int[][] matrix, int k) {
        matrixBool = new boolean[matrix.length][matrix[0].length];
        dfs(0, 0, matrix);

        while (k > 1) {
            queue.poll();
            k--;
        }

        return queue.peek();

    }

    //    //https://leetcode.com/submissions/detail/352297158/?from=/explore/interview/card/top-interview-questions-hard/120/sorting-and-searching/858/
    void dfs(int row, int col, int[][] matrix) {

        if (col < 0 || col >= matrix[0].length || row < 0 || row >= matrix.length || matrixBool[row][col] == true) {
            return;
        }

        //    System.out.println(matrix[row][col]);


        matrixBool[row][col] = true;
        queue.add(matrix[row][col]);

        dfs(row + 1, col, matrix);
        dfs(row, col + 1, matrix);

    }


}