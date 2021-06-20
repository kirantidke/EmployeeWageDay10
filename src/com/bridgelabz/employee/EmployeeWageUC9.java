package com.bridgelabz.employee;

public class EmployeeWageUC9 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numberOfWorkingDays;
	private final int maxHoursPerMonth;
	
	public EmployeeWageUC9(String company, int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
	
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void computeEmpWage() {
		
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
		//System.out.println("total employee wage for company = " + company + " is " +totalEmpWage);
		//return totalEmpWage;

	}
	@Override
	public String toString() {
		return "Total emp wage for company " +company;
	}
	public static void main(String[] args) {
		
		EmployeeWageUC9  dMart = new EmployeeWageUC9("Dmart",20,2,10);
		EmployeeWageUC9  reliance = new EmployeeWageUC9("reliance",20,2,10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}

}
