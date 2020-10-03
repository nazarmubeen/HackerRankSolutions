Any problem that asks us to find the top/smallest/frequent ‘K’ 
elements among a given set falls under this pattern.

Datastructure to use: Heap

PriorityQueue: By default it is heap implementation in java as minheap. to make it max heap we need to pass reverse order as a parameter.

PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());