package com.rmsi.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	
	public static String companyName;
	public static String companyLocation;
	
	public Employee(int no)
	{
		empId=no;
		System.out.println("Launch browser");
		System.out.println("Object created");
	}
	
	public Employee(int no,String name)
	{
		empId=no;
		System.out.println("Launch browser");
		System.out.println("Object created");
	}
	
	public Employee(String name,int no)
	{
		empId=no;
		System.out.println("Launch browser");
		System.out.println("Object created");
	}
	
	public static String getAuthorName()
	{
		String name="Balaji Dinakaran";
		return name;
	}

	public void printEmployeeDetails()
	{
		System.out.println("-------------------------");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);
		System.out.println("-------------------------");
	}
	
}
