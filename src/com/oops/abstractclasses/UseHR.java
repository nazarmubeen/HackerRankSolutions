package com.oops.abstractclasses;

public class UseHR {

	public static void main(String[] args)
	{
		HR hr=new HR();
		hr.hireEmployee(new Salaried("Rahul"));
		hr.hireEmployee(new Salaried("Sita"));
		hr.hireEmployee(new Salaried());
		hr.printEverybody();
		hr.payEverybody();
	}
}
