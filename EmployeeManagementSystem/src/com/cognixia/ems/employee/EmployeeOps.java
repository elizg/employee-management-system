package com.cognixia.ems.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognixia.ems.ReadFromConsole;

public class EmployeeOps {

	// use list interface w/ arraylist
	// make EmployeeOps object to reference its own arraylist
	private static List<Employee> empInfo = new ArrayList<Employee>();
	// you could also make it a hashmap

	public static void addEmp() {
		Scanner sc = ReadFromConsole.sc;

		System.out.println("Enter Employee's First Name: ");
		String firstName = sc.nextLine();

		sc.nextLine(); // had to add this in to prevent input lines with different data types from
						// printing simultaneously, if you know a better solution, let me know

		System.out.println("Enter Employee's Last Name: ");
		String lastName = sc.nextLine();

		// grab dept list from DepartmentOps and set up the choices for user by dept id
		System.out.println("Enter Employee's Department: ");
		String department = sc.nextLine();

		System.out.println("Enter Employee's Job Title: ");
		String jobTitle = sc.nextLine();

		System.out.println("Enter Employee's Salary: ");
		int salary = sc.nextInt();

		System.out.println("Enter Employee's Email: ");
		String email = sc.nextLine();
		sc.nextLine();

		Employee emp1 = new Employee(firstName, lastName, department, jobTitle, salary, email);
		// pass in the info for each employee
		// emp1 is the reference to the newly created obj
		// new Employee = creates a new employee obj and the Employee constructor has a
		// counter variable which increments the id# and assigns it as new employee id

		empInfo.add(emp1);
		// adding the newly created obj ref into arrlist

	}

	
	
	// TODO complete updateEmp()
	// select emp based on id
	// ask user to give emp id
	// get emp,
	// ask for list of what to update, update w/ setter
	public static void updateEmp() {
		Scanner sc = ReadFromConsole.sc;
		System.out.println("Enter Employee Id to update: ");
		int empId = sc.nextInt();

		sc.hasNextLine();

		for (Employee emp : empInfo) {
			if (emp.getEmpId() == empId) {
				System.out.println(empId);
				System.out.println("Select a field to update for employee :" + empId);
				// TODO complete method
				// create selection menu
				// use the scanner to read the input
				// switch case for selections  
				// 1 - string firstname =  read the first name sc.getLine()
				//     emp.setFirstName(firstname)
				// break
				// 2  - string lastname - read
				//     emp.setLastname(lastname)
				
			}
		}
	}

	
	
	
	
	// ask for id and remove it, find emp index
	// ie look up how to remove obj from arraylist
	public static void removeEmp() {
		Scanner sc = ReadFromConsole.sc;
		System.out.println("Enter Employee Id: ");
		int empId = sc.nextInt();
		boolean deletion = false;
		Employee d = null;
		sc.nextLine();

		// loop thru all employee obj of the empInfo list
		// TODO ask if this is the best way to delete
		for (Employee emp : empInfo) {
			if (emp.getEmpId() == empId) {
				deletion = true;
				d = emp;
			}
		}
		if (deletion) {
			empInfo.remove(d);
			System.out.println("Employee removed");
		}
	}

	// loop through and print emps
	public static void listEmp() {
		// loop thru all employee obj of the empInfo list
		for (Employee emp : empInfo) {
			System.out.println(emp.getEmpId() + emp.getFirstName() + emp.getLastName() + emp.getDepartment() + emp.getJobTitle() + emp.getSalary() + emp.getEmail());
		}
	}
}
