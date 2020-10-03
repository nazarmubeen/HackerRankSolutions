package grokkingpatterns.topkelements;

import java.util.PriorityQueue;

public class ConnectRopes {

    public static int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : ropeLengths) {
            minHeap.add(i);
        }
        int cost = 0;

        while (minHeap.size() > 1 && !minHeap.isEmpty()) {
            int currentCost = minHeap.poll() + minHeap.poll();
            cost = cost + currentCost;
            minHeap.add(currentCost);
        }

        return cost;
    }

    public static void main(String[] args) {
        int result = ConnectRopes.minimumCostToConnectRopes(new int[]{1, 3, 11, 5});
        System.out.println("Minimum cost to connect ropes: " + result);
        result = ConnectRopes.minimumCostToConnectRopes(new int[]{3, 4, 5, 6});
        System.out.println("Minimum cost to connect ropes: " + result);
        result = ConnectRopes.minimumCostToConnectRopes(new int[]{1, 3, 11, 5, 2});
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}
