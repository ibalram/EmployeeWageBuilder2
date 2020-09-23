package com.capgemini;


// usecase4
// Solving using Case Statement

public class EmpWageBuilder {

	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch (empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				break;
		}
		empWage = EMP_RATE_PER_HOUR*empHrs;
		System.out.println("Emp Wage: " + empWage);
	}

}
