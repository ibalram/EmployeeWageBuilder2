package com.capgemini;


// usecase1
// Check employee is present or not

public class EmpWageBuilder {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		
		int empCheck = (int) Math.floor(Math.random() *10)%2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	
	}

}
