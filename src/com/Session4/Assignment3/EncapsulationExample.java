package com.Session4.Assignment3;

public class EncapsulationExample {

	/*
	 * Create a encapsulation class for employee details.
	 *
	 */
	public static void main(String[] args) {
		Employee.company = "Acadgild Software Ltd."; 
		Employee  emp1 = new Employee("Sumit","IOS & Android Developmet" , 100000);
		Employee  emp2 = new Employee("Punit","Accounts" , 50000);
		Employee  emp3 = new Employee("Ajay","PHP Development" , 35000);
		Employee  emp4 = new Employee("Kanika","HR" , 14000);
		
		emp1.print();
		emp2.print();
		emp3.print();
		emp4.print();
	}

	
	
}


class Employee
{
	private String name;
	private String dept;
	public static String company = "";
	private int salary;
	
	public Employee(String name , String dept, int sal)
	{
		this.name = name;
		this.dept = dept;
		this.salary = sal;
	}
	
	public void print()
	{
		System.out.println("--------------------------------");
		System.out.println("Employee Name : "+ this.name);
		System.out.println("Employee Department : "+ this.dept);
		System.out.println("Employee Salary : "+ this.salary);
		System.out.println("Employee Company : "+ company);
	}
	
}