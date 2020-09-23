package com.capgemini;


// usecase2
// Calculate Daily Employee Wage

public class EmpWageBuilder {

	public static void main(String[] args) {
		int EMP_RATE_PER_HOUR = 20;
		int IS_FULL_TIME = 1;
		
		double check = Math.floor(Math.random()*10)%2;
		int dayHour = 0;
		if (check==IS_FULL_TIME)
			dayHour = 8;
		int dailyWage = EMP_RATE_PER_HOUR*dayHour;
		System.out.println("Emp Wage: " + dailyWage);
	}

}
