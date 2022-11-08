package com.javafileio;

public class EmployeePayroll {
	 int id;
	 String name;
	 double salary;
	
	public EmployeePayroll(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeePayroll() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
