package grokkingpatterns.mergeinterval;

import java.util.*;

class Interval {
    int start;
    int end;

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
};

class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2)
            return intervals;

        // sort the intervals by start time
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Interval> results = new LinkedList<Interval>();

        Interval prev = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {

            Interval interval = intervals.get(i);
            if (interval.start <= prev.end) { // overlapping intervals, adjust the 'end'
                prev.end = Math.max(interval.end, prev.end);
            } else { // non-overlapping interval, add the previous interval and reset
                results.add(new Interval(prev.start, prev.end));
                prev = intervals.get(i);
            }

        }
        // add the last interval
        results.add(prev);

        return results;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}