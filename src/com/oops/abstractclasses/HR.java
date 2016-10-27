package com.oops.abstractclasses;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HR {

	//list is an interface
	//employee is generic type
	//<> diamond 
	private List<Employee> employees=new ArrayList<>();
	
	public void hireEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public void layOff(Employee e)
	{
		employees.remove(e);
	}
	
	public void printEverybody()
	{
		//new feature in java 8
		employees.forEach(System.out::println);
	}

	public void payEverybody()
	{
		for(Employee e:employees)
		{
			System.out.printf("paying %s %s%n", e.getName(),
					NumberFormat.getCurrencyInstance(Locale.CANADA).format(e.getPay()));
		}
	
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
}
