package com.bridgelabz.employee;

public class EmployeeWageUC8 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public static int computeEmpWage(String company, int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		int empHrs = 0;
		//int empWage = 0;
		//int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while(totalEmpHrs <=  maxHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_PART_TIME :
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
					
				default:
					empHrs = 0;
			}
			//empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;
			System.out.println("Day = " + totalWorkingDays + "emp hr = "+empHrs);

		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("total employee wage for company = " + company + " is " +totalEmpWage);
		return totalEmpWage;

	}
	public static void main(String[] args) {
		
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("reliance",20,2,10);
	}

}
