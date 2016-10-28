package com.oops.concurrency;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class useExecuters {
	public static void main(String[] args)
	{
	List<MyRunnable> runthreads=Stream.iterate(1, n->n+1).
			map
			(MyRunnable::new).limit(10).collect(Collectors.toList());
	
	ExecutorService service=Executors.newCachedThreadPool();
	runthreads.forEach(service::execute);
	service.shutdown();
	}
}
