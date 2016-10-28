package com.oops.concurrency;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class UseMyRunnable {

	public static void main(String[] args)
	{
		
		List<MyRunnable> runthreads=Stream.iterate(1, n->n+1).
				map
				(MyRunnable::new).limit(10).collect(Collectors.toList());
		runthreads.forEach(MyRunnable::start);
		
	}
}
