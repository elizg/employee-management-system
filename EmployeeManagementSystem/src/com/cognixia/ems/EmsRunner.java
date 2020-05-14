package com.cognixia.ems;

import java.util.Scanner;

public class EmsRunner {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the EMS, please select from the following options:\n" 
				+ "1 - Add New Employee\n"
				+ "2 - Update Employee Information\n" 
				+ "3 - Remove Employee\n" 
				+ "4 - List Employee Information\n"
				+ "5 - View Department Menu");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt(); 
		sc.close();
		}
	}
	
