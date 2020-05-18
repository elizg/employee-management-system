package com.cognixia.ems.department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognixia.ems.ReadFromConsole;

// check that we're not getting the same dept twice when updating new dept

public class DepartmentOps {
	
	// static methods can only access static objects
	private static List<Department> deptInfo = new ArrayList<Department>();

	public static void addDept() {
		Scanner sc = ReadFromConsole.sc;

		System.out.println("Enter Department name: ");
		String deptName = sc.nextLine();

		sc.nextLine(); // had to add this in to prevent input lines with different data types from
						// printing simultaneously, if you know a better solution, let me know

		System.out.println("Enter Department phone number: ");
		String deptPhoneNum = sc.nextLine();

		Department dept1 = new Department(deptName, deptPhoneNum);
		// pass in the info for each department
		// dept1 is the reference to the newly created obj
		// new Department = creates a new department obj and the Department constructor has a
		// counter variable which increments the id# and assigns it as new department id

		deptInfo.add(dept1);
		// adding the newly created obj ref into arrlist

	}
	
	public static void updateDept() {
		// ask which dept to update by id
		// loop through to find and return
		// take input id to display dept info 
		// select which dept info to display, name or phone 
		// update it
	}
	
	public static void removeDept() {
		// ask which dept by id
		// loop thru, find, return
		// delete it with boolean, TODO review 'concurrent modification exception'
	}

	
	// loop through and print dept info
	public static void listDept() {
		// loop thru all department obj of the deptInfo list
		for (Department dept : deptInfo) {
			System.out.println(dept.getDeptId() + dept.getDeptName() + dept.getDeptPhoneNum());
		}
	}

}
