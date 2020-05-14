package com.cognixia.ems;

import java.util.Scanner;

public class Employee {

	// private variables only available in this class, for data hiding
	private int empId;
	private String firstName;
	private String lastName;
	private String department;
	private String jobTitle;
	private int salary;
	private String email;
	private static int counter = 1;
	
	// constructor
	public Employee(String firstName, String lastName, String department, String jobTitle, int salary, String email) {
		super();
		this.empId = counter++; // setting up var to auto-increment
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.email = email;
	}

	// getters setters
	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", jobTitle=" + jobTitle + ", salary=" + salary + ", email=" + email + "]";
	}

/*
 * 
	public void addEmp() {

		Employee employee = new Employee(empId, department, department, department, department, empId, department);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee's ID Number: ");
		employee.setEmpId(sc.nextInt());
		System.out.println("Enter Employee's First Name: ");
		employee.setFirstName(sc.nextLine());
		System.out.println("Enter Employee's Last Name: ");
		employee.setLastName(sc.nextLine());
		System.out.println("Enter Employee's Department: ");
		employee.setDepartment(sc.nextLine());
		System.out.println("Enter Employee's Job Title: ");
		employee.setJobTitle(sc.nextLine());
		System.out.println("Enter Employee's Salary: ");
		employee.setSalary(sc.nextInt());
		System.out.println("Enter Employee's Email: ");
		employee.setEmail(sc.nextLine());

	} */
	
}
