package main.java.priorityQueues;

public class BinaryHeapClient {

	public static void main(String[] args)
	{
		
		BinaryHeap<Integer> heap=new BinaryHeap<>(8);
		heap.insert(15);
		heap.insert(21);
		heap.insert(11);
		heap.insert(1);
		heap.insert(2);
		heap.insert(9);
		heap.insert(8);
		heap.insert(18);
		heap.print();
		heap.deleteMax();
		System.out.println(" ");
		heap.print();
	}
	
	
}

