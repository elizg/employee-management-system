package com.cognixia.ems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeOps {

	// use list interface w/ arrlist
	// make empops obj to reference its own arr list
	private static List<Employee> empInfo = new ArrayList<Employee>();
	
	// in progress
	// TODO we need to add methods here

	private static void addEmp() {
		Scanner sc = ReadFromConsole.sc;
		
		System.out.println("Enter Employee's First Name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Employee's Last Name: ");
		String lastName = sc.nextLine();
		
		// grab dept list from dept ops and give choices give by dept id
		System.out.println("Enter Employee's Department: ");
		String department = sc.nextLine();
		
		System.out.println("Enter Employee's Job Title: ");
		String jobTitle = sc.nextLine();
		
		System.out.println("Enter Employee's Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Enter Employee's Email: ");
		String email = sc.nextLine();
		
		Employee emp1 = new Employee(firstName, lastName, department, jobTitle, salary, email);
		// pass in params
		empInfo.add(emp1);
		
	}

	// select emp based on id
	// ask user to give emp id
	// get emp,
	// ask for list of what to update, update w/ setter
	private static void updateEmp() {

	}
	
	// ask for id and remove, find emp index 
	// ie how to remove obj from arrlist
	private static void removeEmp() {

	}

	// loop thru and print emps
	private static void listEmp() {

	}

	
	private static void viewDept() {

	}

}
