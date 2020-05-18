package com.cognixia.ems;

import java.util.Scanner;

import com.cognixia.ems.department.DepartmentOps;
import com.cognixia.ems.employee.EmployeeOps;

public class EmsRunner {

	public static void main(String[] args) {

		int input = 0;
		
		do {
			// print menu
			menuInput();

			// get menu option
			input = getMenuInput();

			// using a switch to direct user input selection to 1-3 only
			switch (input)

			{
			case 1:
				getEmpMenu();
				break;

			case 2:
				getDeptMenu();
				break;

			case 3:
				System.exit(0);
				break;
				
			// removed while < because have default to redirect
			default:
				System.out.println("Input error!");
				break;
			}

		} while (true);
	}
	
	static void getEmpMenu() {
		
		int input = 0;
		
		do {
			// print menu
			empMenuInput();

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
				return;

			default:
				System.out.println("Input error!");
				break;
			}

		} while (true);
	}

	static void getDeptMenu() {
		
	int input = 0;
	
	do {
		// print menu
		deptMenuInput();

		// get menu option
		input = getMenuInput();

		// using a switch to direct user input selections 1-5
		switch (input)

		{
		case 1:
			DepartmentOps.addDept();
			break;

		case 2:
			DepartmentOps.updateDept();
			break;

		case 3:
			DepartmentOps.removeDept();
			break;

		case 4:
			DepartmentOps.listDept();
			break;
			
		case 5: 
			return;

		default:
			System.out.println("Input error!");
			break;
		}

	} while (true);
}

	public static void menuInput() {

		System.out.println("Welcome to the EMS, you have the following options:\n" 
				+ "1 - View Employee Menu\n"
				+ "2 - View Department Menu\n" 
				+ "3 - Exit\n");
	}
	
	public static void empMenuInput() {
		System.out.println("EMS Employee Menu:\n" 
				+ "1 - Add New Employee\n"
				+ "2 - Update Employee Information\n" 
				+ "3 - Remove Employee\n" 
				+ "4 - List Employee Information\n"
				+ "5 - Exit\n");
	}
	
	public static void deptMenuInput() {
		System.out.println("EMS Department Menu:\n" 
				+ "1 - Add New Department\n"
				+ "2 - Update Department Information\n" 
				+ "3 - Remove Department\n" 
				+ "4 - List Department Information\n"
				+ "5 - Exit\n");
	}

	// method to read menu input
	public static int getMenuInput() {
		
		int input;
		
		// using the already created scanner object from Read From Console class
		Scanner sc = ReadFromConsole.sc;
		
		System.out.println("Enter your selection: ");
		input = sc.nextInt();
		System.out.println();
		
		return input;

	}

}
