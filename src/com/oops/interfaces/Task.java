package com.oops.interfaces;

import java.time.LocalDate;

public class Task implements Comparable<Task>{

	private int id;
	private String name;
	private LocalDate startdate;
	private LocalDate enddate;
	private int priority;
	private boolean completed;
	
	
	public Task()
	{
		
	}
	
	public Task(int id,String name,int priority)
	{
		this(id,name,LocalDate.now(),LocalDate.now(),priority,false);
	}
	
	
	public Task(int id, String name, LocalDate startdate, LocalDate enddate, int priority, boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.enddate = enddate;
		this.priority = priority;
		this.completed = completed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", startdate=" + startdate + ", enddate=" + enddate + ", priority="
				+ priority + ", completed=" + completed + "]";
	}

	@Override
	public int compareTo(Task task) {
		
		return name.compareTo(task.name);
	}
	
	
	
	
}
