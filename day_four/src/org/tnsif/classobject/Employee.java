//program to demonstrate on use of class and objects
package org.tnsif.classobject;
//class definition
public class Employee {
//	default data members
	int empId;
	float salary;
	String empName, department;	
//	method declaration and definition
	void display()
	{
		System.out.println("Emp ID: "+empId+ " \nEmp Name: "+empName+ "\nEmp Salary: "+salary+"\nEmp Department: "+department);
	}
}