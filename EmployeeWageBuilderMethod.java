package com.employeepart2;

import java.util.Random;

public class EmployeeWageBuilderMethod 
{
	public static void main(String[] args) 
{
	int empHrs = 0;
	int wagephr =20;
	Random random = new Random();
	int randomNum = random.nextInt(2);
	
	if (randomNum == 1)
	{
		System.out.println("Employee is Present");
		empHrs = 8;
	}
	else
		System.out.println("Employee is Absent");
	
	double salary = empHrs * wagephr ;
	System.out.println("Employee Wage is : " +salary);
	}

}
