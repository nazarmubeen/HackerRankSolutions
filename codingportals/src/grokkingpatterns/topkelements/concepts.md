Any problem that asks us to find the top/smallest/frequent ‘K’ 
elements among a given set falls under this pattern.

Datastructure to use: Heap

PriorityQueue: By default it is heap implementation in java as minheap. to make it max heap we need to pass reverse order as a parameter.

PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

also can declare heaps by using lambda expression 

PriorityQueue<Integer> minHeap=new PriorityQueue<>((a1,a2)->a1-a2);
PriorityQueue<Integer> minHeap=new PriorityQueue<>((a1,a2)->a2-a1);

can be used with map as well.

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (e1, e2) -> e1.getValue() - e2.getValue());

can sort hashmap using frequency.