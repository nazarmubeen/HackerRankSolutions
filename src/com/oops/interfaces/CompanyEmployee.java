package com.oops.interfaces;

//class overrides interface
//class always beats interface
//child overrides parent


public class CompanyEmployee implements Employee,Company {
	
	private String first;
	private String last;
	
	@Override
	public String getName() {
		return String.format("%s working for %s",
				Employee.super.getName(),Company.super.getName());
	}
	
	
	@Override
	public String getFirst() {
		
		return first;
	}
	@Override
	public String getLast() {
		
		return last;
	}
	@Override
	public void doWork() {
		System.out.println("working ...");
		
	}
	
	
	

	
}
