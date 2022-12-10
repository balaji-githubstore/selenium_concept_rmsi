package com.rmsi.employee;

public class RunnerTest {
	
	public static void main(String[] args) {
				
		Employee.companyName="RMSI";
		Employee.companyLocation="Chennai";
		
		Employee.companyName="RMSI pvt ltd";
		Employee.companyName="HHHH";
		
		Employee emp1=new Employee(101);
		emp1.empId=101;
		emp1.empName="Saul";
		emp1.empSalary=9000;
		
		Employee emp2=new Employee(102);
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=8000;
		
		
		String authorName=Employee.getAuthorName();
		System.out.println(authorName);
		
		emp2.printEmployeeDetails();
		
		emp1.printEmployeeDetails();
	}
}
