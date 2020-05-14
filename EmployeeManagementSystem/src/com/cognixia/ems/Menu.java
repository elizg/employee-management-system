package com.cognixia.ems;

import java.util.Scanner;

public class Menu {

	public void makeSelection() {

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		// using a switch to direct user input selections 1-5
		switch (choice) {
		case 1:
			addEmp();
			break;
			
		case 2:
			updateEmp();
			break;

		case 3:
			removeEmp();
			break;

		case 4:
			listEmp();
			break;
			
		case 5:
			viewDept();
		default:
			break;
		}

		sc.close();

	}

}
