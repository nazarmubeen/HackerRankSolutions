package queue;

import java.util.*;

public class TestQueue {

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> minpq = new PriorityQueue<>((n1,n2)->(n1-n2));
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((n1,n2)->(n2-n1));
        int[] arr={3,2,1,5,6,4};
        for(int i:arr){
            pq.add(i);
            minpq.add(i);
            maxpq.add(i);
        }

        System.out.println("pq "+pq);
        System.out.println("minpq "+minpq);
        System.out.println("maxpq "+maxpq);

       /* ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(21,22,56,98,78,5,1,45,3,6,25,456,0));
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> defaultHeap=new PriorityQueue<>(number.size(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1.intValue(),o2.intValue());
            }
        });

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:number){
            minHeap.add(i);
            maxHeap.add(i);
            defaultHeap.add(i);
        }

        System.out.println("minHeap "+minHeap);
        System.out.println("maxHeap "+maxHeap);
        System.out.println("defaultHeap "+defaultHeap);

        while(!minHeap.isEmpty()){
            System.out.println("removing elements");
            System.out.println(minHeap.poll());
            System.out.println(maxHeap.poll());
            System.out.println(defaultHeap.poll());
        }*/

    }
}
