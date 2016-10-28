package com.oops.concurrency;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.policy.sourcemodel.attach.ExternalAttachmentsUnmarshaller;

public class FileLinesCounter {

	private Path dir=Paths.get("src","Graph");
	
	public long computeTotalNumberOfLines()
	{
		long total=0;
		try{
		total=executeCounters().stream().mapToLong(this::extractValueFromFuture).sum();
		}
		catch(InterruptedException | IOException e){
			System.err.println(e.getMessage());
		}
		
	return total;	
	}
	
	private List<Future<Long>> executeCounters() throws InterruptedException,IOException
	{
		ExecutorService service=Executors.newCachedThreadPool();
		List<Future<Long>> futures=service.invokeAll(getFileLineCounter());
		service.shutdown();
		return futures;	
	}
	
	private List<Callable<Long>> getFileLineCounter() throws IOException
	{
		return Files.list(dir).filter(Files::isRegularFile)
				.map(this::callablePrintingCounter).collect(Collectors.toList());
	}
	
	
	private Callable<Long> callableCounter(Path p)
	{
		return() -> Files.lines(p).count();
	}
	

	private Callable<Long> callablePrintingCounter(Path p)
	{
		return() ->{
			
			Long count=Files.lines(p).count();
			System.out.printf("%s has so %d  many lines %n",p,count);
			return count;
		};
	}
	
	private<T> T extractValueFromFuture(Future<T> future)
	{
		T val=null;
		
			try {
				val=future.get();
			} catch (ExecutionException | InterruptedException e) {
				System.err.println(e.getMessage());
			}
			return val;
		}
		
	
	
	
	public static void main(String[] args)
	{
		FileLinesCounter fi=new FileLinesCounter();
		System.out.println("number of lines"+fi.computeTotalNumberOfLines());
	}
}
