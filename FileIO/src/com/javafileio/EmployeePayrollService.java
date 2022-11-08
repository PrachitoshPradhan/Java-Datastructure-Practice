package com.javafileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
	private List<EmployeePayroll> empList = new ArrayList<>();
	EmployeePayroll employeeData ;
	
//	public EmployeePayrollService() {
//		employeeData = new EmployeePayroll();
//	}
	
	Scanner scanner = new Scanner(System.in);
	 
	public void readEmployeeData() {
		
		System.out.println("Enter the employee id : ");
		int id = scanner.nextInt();
		System.out.println("Enter the employee name : ");
		String name = scanner.next();
		System.out.println("Enter the employee salary : ");
		double salary = scanner.nextDouble();
		empList.add(new EmployeePayroll(id,name,salary));
		
	}
	
	public void writeData() throws IOException{
		FileWriter writer = new FileWriter("C:/Users/polle/Desktop/filepath.txt");
		writer.write(empList.toString());
		writer.close();
		System.out.println("Employee Data");
		System.out.println(empList);
	}
	
	public static void main(String[] args) {
		
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.readEmployeeData();
		try {
			emp.writeData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
