package com.cognixia.ems;

import java.util.Scanner;

import com.cognixia.ems.employee.EmployeeOps;

public class EmsRunner {

	public static void main(String[] args) {

		// put in try catch block
		int input = 0;
		
		do {
			// print menu
			menuInput();

			// get menu option
			input = getMenuInput();

			// using a switch to direct user input selections 1-5
			switch (input)

			{
			case 1:
				EmployeeOps.addEmp();
				break;

			case 2:
				EmployeeOps.updateEmp();
				break;

			case 3:
				EmployeeOps.removeEmp();
				break;

			case 4:
				EmployeeOps.listEmp();
				break;

			case 5:
				EmployeeOps.viewDept();
				break;
			default:
				System.out.println("Input error!");
				break;
			}

		} while (input < 6);
	}



	public static void menuInput() {

		// initially add emp, dept, exit
		// switch case case 1, emp menu, dept
		System.out.println("Welcome to the EMS, you have the following options:\n" 
				+ "1 - Add New Employee\n"
				+ "2 - Update Employee Information\n" 
				+ "3 - Remove Employee\n" 
				+ "4 - List Employee Information\n"
				+ "5 - View Department Menu\n");
	}

	// method to read menu input
	public static int getMenuInput() {
		
		// TODO ask about duplicate scanner object
		int input;
		// using the already created scanner object from Read From Console class
		Scanner sc = ReadFromConsole.sc;
		System.out.println("Enter your selection: ");
		input = sc.nextInt();
		return input;
	}

}
