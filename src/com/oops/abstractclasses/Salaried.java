package com.oops.abstractclasses;

//must implement all unimplemented method
public class Salaried extends Employee {

	private static final double DEFAULT_SALARY=120000;
	private double salary=DEFAULT_SALARY;
	
	public Salaried()
	{
		
	}
	
	public Salaried(String name)
	{
		this(name,DEFAULT_SALARY);
	}
	
	
	public Salaried(String name,double salary)
	{
		//calling constructor of a super class
		super(name);
		this.salary=salary;
	}
	
	
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public double getPay() {	
		return salary/24;
	}

}
