package com.bridgelabz.employee;

public class EmployeeWageUC10 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numberOfCompany= 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWageUC10() {
		companyEmpWageArray = new CompanyEmpWage[6];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		companyEmpWageArray[numberOfCompany] = new CompanyEmpWage(company,empRatePerHour,numberOfWorkingDays, maxHoursPerMonth);
		numberOfCompany++;
	}
	public void computeEmpWage() {
		
		for( int i = 0;i < numberOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
			
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays) {
			totalWorkingDays++;
			
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
			
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: "+ totalWorkingDays + "Emp Hr:" +empHrs);
			
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	public static void main (String[] args) {
		EmployeeWageUC10 empWageBuilder = new EmployeeWageUC10();
		empWageBuilder.addCompanyEmpWage("DMart",20,3,10);
		empWageBuilder.addCompanyEmpWage("Reliance",20,38,10);
		empWageBuilder.computeEmpWage();
	}
			
}
class CompanyEmpWage{
	
	public final String company;
	public final int empRatePerHour;
	public final int numberOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour,int numberOfWorkingDays, int maxHourPerMonth) {
		
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHoursPerMonth = maxHourPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage =  totalEmpWage;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for company: "+company+ "is: "+totalEmpWage;
	}
	
}
