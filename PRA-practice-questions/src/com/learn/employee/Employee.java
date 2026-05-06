package com.learn.employee;

import java.util.Scanner;

class EmployeeDetails {

	private int empId;
	private String empName;
	private String department;
	private double salary;

	// parametrized constructor
	public EmployeeDetails(int empId, String empName, String department,
			double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}

	// getters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Employee {

	// function or method for finding highest salary
	public static EmployeeDetails findHighestSalaryEmployee(EmployeeDetails[] employees,
			String department) {
		EmployeeDetails res = null;
		double maxSalary = 0;
		
		for(EmployeeDetails emp: employees) {
			if(emp.getDepartment().equalsIgnoreCase(department)) {
				if (emp.getSalary() > maxSalary) {
					maxSalary = emp.getSalary();
					res = emp;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number of Employee: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		EmployeeDetails[] employeeDetails = new EmployeeDetails[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Employee ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Employee Name: ");
			String name = scanner.nextLine();
			
			System.out.println("Employee Department: ");
			String department = scanner.nextLine();
			
			System.out.println("Employee Salary: ");
			Double salary = scanner.nextDouble();
			scanner.nextLine();
			
			employeeDetails[i] = new EmployeeDetails(id, name, department, salary);
			
		}
		
		System.out.println("Enter the department for filtering: ");
		String department = scanner.nextLine();
		
		EmployeeDetails resultDetails = findHighestSalaryEmployee(employeeDetails, department);
		
		if(resultDetails == null) {
			System.out.println("No Employee Found");
		} else {
			System.out.println("Employee Deatils: ");
			System.out.println(resultDetails.getEmpId());
			System.out.println(resultDetails.getEmpName());
			System.out.println(resultDetails.getSalary());
		}
		
	}
}
