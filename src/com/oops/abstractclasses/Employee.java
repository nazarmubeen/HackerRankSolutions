package com.oops.abstractclasses;

import java.time.LocalDate;



/*
 * 1) abstract class can't be instantiated.
 * 2) child class must implement all abstract methods.
 * 3) To declare a method abstract class should be abstract
 * 
 */
public abstract class Employee {

	private static final String default_name="UNKNOWN";
	private static int nextId;
	
	private Integer Id;
	private String name;
	//new feature java 8
	private LocalDate hiredate;
	
	public Employee()
	{
//way for invoke one constructor to other constructor in same class
		this(default_name);
	}
	
	public Employee(String name) {
		Id = nextId++;
		this.name = name;
		this.hiredate = LocalDate.now();
	}
	
	
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}
	public Integer getId() {
		return Id;
	}
	
	private void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public static String getDefaultName() {
		return default_name;
	}

	//implementation will be based on the employee
	public abstract double getPay();

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", hiredate=" + hiredate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
