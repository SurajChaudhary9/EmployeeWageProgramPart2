package com.employeepart2;

public class EmployeeWageBuilderMethod 
{
	public static final int Present = 1;

	public static void Attendance() 
	{
		//local variables
		int wrkHrs;
		int empCheck = (int)(Math.random()*10)%2;

		//computation to check Attendance
		if(empCheck == Present) 
		{
			wrkHrs = 8;
			System.out.println("Employee is Present");
			System.out.println("Working Hours = "+wrkHrs);
		}
		else 
		{
			wrkHrs = 0;
			System.out.println("Employee is Absent"+wrkHrs);
			System.out.println("Working Hours = "+wrkHrs);
		}
	}

	public static void main(String[] args) {
		Attendance();
	}

}
