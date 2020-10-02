package leetcode.graph;

import java.util.ArrayList;

class TopologicalSort {
    ArrayList<Integer>[] graph;
    char[] test;

    public boolean canFinish(int numCourses, int[][] prerequisites) {


        graph = new ArrayList[numCourses];
        test = new char[numCourses];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int[] edge = prerequisites[i];
            graph[edge[0]].add(edge[1]);
        }

        for (int i = 0; i < graph.length; i++) {

            if (test[i] == 'e')
                continue;

            if (test[i] != 's') {
                test[i] = 's';
                traverseChildren(i);
            } else {
                return false;
            }
        }

        return true;

    }

    public boolean traverseChildren(int parent) {

        for (int child : graph[parent]) {

            if (test[child] == 's')
                return false;

            test[child] = 's';
            traverseChildren(child);
        }

        test[parent] = 'e';
        return true;
    }
}
