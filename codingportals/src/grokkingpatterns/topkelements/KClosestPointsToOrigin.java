package grokkingpatterns.topkelements;

import java.util.*;


class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distFromOrigin() {
        // ignoring sqrt
        return (x * x) + (y * y);
    }
}

public class KClosestPointsToOrigin {

    public static List<Point> findClosestPoints(Point[] points, int k) {
        ArrayList<Point> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Point> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int dist = points[i].distFromOrigin();
            minHeap.add(dist);
            map.put(dist, points[i]);
        }

        for (int i = k; i < points.length; i++) {
            int dist = points[i].distFromOrigin();
            if (dist < minHeap.peek()) {
                minHeap.poll();
                minHeap.add(dist);
                map.put(dist, points[i]);
            }
        }

        while (!minHeap.isEmpty()) {
            result.add(map.get(minHeap.poll()));
        }
        return result;
    }

    public static void main(String[] args) {
        Point[] points = new Point[]{new Point(1, 3), new Point(3, 4), new Point(2, -1)};
        List<Point> result = KClosestPointsToOrigin.findClosestPoints(points, 2);
        System.out.print("Here are the k points closest the origin: ");
        for (Point p : result)
            System.out.print("[" + p.x + " , " + p.y + "] ");
    }
}
