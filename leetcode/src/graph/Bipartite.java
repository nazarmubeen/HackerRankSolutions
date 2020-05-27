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
}