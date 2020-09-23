package com.capgemini;


// usecase2
// Calculate Daily Employee Wage

public class EmpWageBuilder {

	public static void main(String[] args) {
		int EMP_RATE_PER_HOUR = 20;
		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 1;
		
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random()*10)%3;
		if (empCheck==IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck==IS_PART_TIME)
			empHrs = 4;
		empWage = EMP_RATE_PER_HOUR*empHrs;
		System.out.println("Emp Wage: " + empWage);
	}

}
