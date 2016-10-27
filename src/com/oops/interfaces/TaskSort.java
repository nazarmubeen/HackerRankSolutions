package com.oops.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSort {

	public static void main(String[] args)
	{
		List<Task> tasks=new ArrayList<>();
		
		tasks.add(new Task(1, "Catch Rabbit", 4));
		tasks.add(new Task(3, "Go to salon", 2));
		tasks.add(new Task(2, "Go for bath", 1));
		tasks.add(new Task(5, "Party hard", 6));
		tasks.add(new Task(4, "Read book", 5));
		tasks.add(new Task(6, "tell something", 3));
		
		//print in as inserted order
		for(Task t:tasks)
		{
			System.out.println(t);
		}
		
		//print in as inserted order
		tasks.forEach(System.out::println);
		
		//sorting is based on names as implemented in Task class
		Collections.sort(tasks);
	}
}
